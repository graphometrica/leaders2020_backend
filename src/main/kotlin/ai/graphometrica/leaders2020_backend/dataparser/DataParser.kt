package ai.graphometrica.leaders2020_backend.dataparser

import ai.graphometrica.leaders2020_backend.model.entity.AdditionalInfoEntity
import ai.graphometrica.leaders2020_backend.model.entity.AdministrativeDistrictEntity
import ai.graphometrica.leaders2020_backend.model.entity.BossEmployeeEntity
import ai.graphometrica.leaders2020_backend.model.entity.CareEmployeeEntity
import ai.graphometrica.leaders2020_backend.model.entity.CatchInfoEntity
import ai.graphometrica.leaders2020_backend.model.entity.CatchOrderEntity
import ai.graphometrica.leaders2020_backend.model.entity.CuratorEntity
import ai.graphometrica.leaders2020_backend.model.entity.GeneralInfoEntity
import ai.graphometrica.leaders2020_backend.model.entity.ShelterEntity
import ai.graphometrica.leaders2020_backend.model.entity.VeterinarianEmployeeEntity
import ai.graphometrica.leaders2020_backend.repository.AdditionalInfoRepository
import ai.graphometrica.leaders2020_backend.repository.AdministrativeDistrictRepository
import ai.graphometrica.leaders2020_backend.repository.BossEmployeeRepository
import ai.graphometrica.leaders2020_backend.repository.CareEmployeeRepository
import ai.graphometrica.leaders2020_backend.repository.CatchInfoRepository
import ai.graphometrica.leaders2020_backend.repository.CatchOrderRepository
import ai.graphometrica.leaders2020_backend.repository.CuratorRepository
import ai.graphometrica.leaders2020_backend.repository.GeneralInfoRepository
import ai.graphometrica.leaders2020_backend.repository.NewOwnerRepository
import ai.graphometrica.leaders2020_backend.repository.ShelterRepository
import ai.graphometrica.leaders2020_backend.repository.VeterinarianEmployeeRepository
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.io.File
import java.io.FileInputStream
import javax.annotation.PostConstruct

@Service
class DataParser(
        val bossEmployeeRepository: BossEmployeeRepository,
        val careEmployeeRepository: CareEmployeeRepository,
        val veterinarianEmployeeRepository: VeterinarianEmployeeRepository,
        val curatorRepository: CuratorRepository,
        val catchOrderRepository: CatchOrderRepository,
        val administrativeDistrictRepository: AdministrativeDistrictRepository,
        val shelterRepository: ShelterRepository,
        val generalInfoRepository: GeneralInfoRepository,
        val additionalInfoRepository: AdditionalInfoRepository,
        val catchInfoRepository: CatchInfoRepository,
        val newOwnerRepository: NewOwnerRepository
) {

    private fun getFirstSheet(file: File): XSSFSheet {
        val book = XSSFWorkbook(FileInputStream(getFile()))
        return book.getSheetAt(0)
    }

    private fun getFile(): File {
        return File("src/main/resources/dataset.xlsx")
    }

    @PostConstruct
    fun runParsing() {
        val sheet = getFirstSheet(getFile())

//        parseBosses(sheet)
//        parseCare(sheet)
//        parseVeterinarian(sheet)
//        parseCurator(sheet)
//        parseOrders(sheet)
//        parseAdministrativeDistrict(sheet)
//        parseShelters(sheet)
//        parseGeneralInfo(sheet)
//        parseAdditionalInfo(sheet)
//        parseCatchInfo(sheet)

    }

    fun parseBosses(sheet: XSSFSheet) {
        val bossesNames: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            bossesNames.add(row.getCell(43).toString())
        }
        val bosses = bossesNames
                .filter { it.isNotEmpty() }
                .map { BossEmployeeEntity().apply { name = it } }
        bossEmployeeRepository.saveAll(bosses)
    }

    fun parseCare(sheet: XSSFSheet) {
        val careNames: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            careNames.add(row.getCell(44).toString())
        }
        val cares = careNames
                .filter { it.isNotEmpty() }
                .map { CareEmployeeEntity().apply { name = it } }
        careEmployeeRepository.saveAll(cares)
    }

    fun parseVeterinarian(sheet: XSSFSheet) {
        val veterinarianNames: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            veterinarianNames.add(row.getCell(17).toString())
        }
        val veterinarians = veterinarianNames
                .filter { it.isNotEmpty() }
                .map { VeterinarianEmployeeEntity().apply { name = it } }
        veterinarianEmployeeRepository.saveAll(veterinarians)
    }

    fun parseCurator(sheet: XSSFSheet) {
        val curatorNames: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            curatorNames.add(row.getCell(27).toString())
        }
        val curators = curatorNames
                .filter { it.isNotEmpty() }
                .map { CuratorEntity().apply { name = it } }
        curatorRepository.saveAll(curators)
    }

    fun parseOrders(sheet: XSSFSheet) {
        val orders = sheet.map { row ->
            CatchOrderEntity().apply {
                catchOrderActNumber = row.getCell(19).toString()
                catchOrderActDate = try {
                    row.getCell(20).dateCellValue
                } catch (ex: Exception) {
                    null
                }
            }
        }
        catchOrderRepository.saveAll(orders)
    }

    fun parseAdministrativeDistrict(sheet: XSSFSheet) {
        val districtsNames: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            districtsNames.add(row.getCell(21).toString())
        }
        val istricts = districtsNames
                .filter { it.isNotEmpty() }
                .map { AdministrativeDistrictEntity().apply { name = it } }
        administrativeDistrictRepository.saveAll(istricts)
    }

    fun parseShelters(sheet: XSSFSheet) {
        val shelters = sheet.map { row ->
            ShelterEntity().apply {
                adress = row.getCell(41).toString()
                serviceOrganization = row.getCell(42).toString()
                bossEmployee = try {
                    bossEmployeeRepository.findByName(row.getCell(43).toString()).bossEmployeeId
                } catch (e: Exception) {
                    null
                }

                careEmployee = try {
                    careEmployeeRepository.findByName(row.getCell(44).toString()).careEmployeeId
                } catch (e: Exception) {
                    null
                }
            }
        }
        val sheltersMap: HashMap<String?, ShelterEntity> = hashMapOf()
        shelters.forEach { sheltersMap[it.adress] = it }
        shelterRepository.saveAll(sheltersMap.values)
    }

    fun parseGeneralInfo(sheet: XSSFSheet) {
        val generalInfo = sheet.map { row ->
            GeneralInfoEntity().apply {
                cardNumber = row.getCell(1).toString()
                type = row.getCell(2).toString()
                year = row.getCell(3).toString()
                weight = row.getCell(4).toString()
                nickname = row.getCell(5).toString()
                gender = row.getCell(6).toString()
                breed = row.getCell(7).toString()
                color = row.getCell(8).toString()
                wool = row.getCell(9).toString()
                ears = row.getCell(10).toString()
                tail = row.getCell(11).toString()
                size = row.getCell(12).toString()
                specialSigns = row.getCell(13).toString()
                aviary = row.getCell(14).toString()
                shelter = try {
                    shelterRepository.findByAdress(row.getCell(41).toString()).shelterId
                } catch (e: Exception) {
                    null
                }

                administrativeDistrict = try {
                    administrativeDistrictRepository.findByName(row.getCell(21).toString()).administrativeDistrictId
                } catch (e: Exception) {
                    null
                }
            }
        }

        generalInfoRepository.saveAll(generalInfo)
    }


    fun parseAdditionalInfo(sheet: XSSFSheet) {
        val additionalInfo = sheet.map { row ->
            AdditionalInfoEntity().apply {
                identificationMark = row.getCell(15).toString()
                sterilizationDate = try {
                    row.getCell(16).dateCellValue
                } catch (e: Exception) {
                    isSterilized = sterializationCommentConverter(row.getCell(16).toString())
                    sterilizationComment = row.getCell(16).toString()
                    null
                }
                isSocialized = yesNoToBooleanConverter(row.getCell(18).toString())

                veterinarianEmployee = try {
                    veterinarianEmployeeRepository.findByName(row.getCell(18).toString()).veterinarianEmployeeId
                } catch (e: Exception) {
                    null
                }
                generalInfo = try {
                    generalInfoRepository.findByCardNumber(row.getCell(1).toString()).generalInfoId
                } catch (e: Exception) {
                    null
                }
            }
        }

        additionalInfoRepository.saveAll(additionalInfo)
    }

    fun parseCatchInfo(sheet: XSSFSheet) {
        val catchInfo = sheet.map { row ->
            CatchInfoEntity().apply {
                actNumber = row.getCell(22).toString()
                address = row.getCell(23).toString()

                catchOrder = try {
                    catchOrderRepository.findByCatchOrderActNumber(row.getCell(19).toString()).catchOrderId
                } catch (e: Exception) {
                    null
                }

                administrativeDistrict = try {
                    administrativeDistrictRepository.findByName(row.getCell(21).toString()).administrativeDistrictId
                } catch (e: Exception) {
                    null
                }

                generalInfo = try {
                    generalInfoRepository.findByCardNumber(row.getCell(1).toString()).generalInfoId
                } catch (e: Exception) {
                    null
                }
            }
        }

        catchInfoRepository.saveAll(catchInfo)
    }

//    fun parseNewOwner(sheet: XSSFSheet) {
//        val newOwnerInfo = sheet.map { row ->
//            NewOwnerEntity().apply {
//
//
//                general_info = try {
//                    generalInfoRepository.findByCardNumber(row.getCell(1).toString()).general_info_id
//                } catch (e: Exception) {
//                    null
//                }
//            }
//        }
//
//        catchInfoRepository.saveAll(catchInfo)
//    }

    private fun yesNoToBooleanConverter(answer: String): Boolean? {
        return when (answer) {
            "да" -> true
            "нет" -> false
            else -> null
        }
    }

    private fun sterializationCommentConverter(answer: String): Boolean? {
        return when (answer.trim()) {
            "стерилизована ранее" -> true
            "без стер.ввиду возраста" -> true
            "без стерилизации ввиду возраста" -> true
            "без стерилизации по возрасту" -> true
            "Зона карантина" -> true
            "кастрирован ранее" -> true
            "не рекомендовано по возрасту" -> true
            "поступила стерилизованная" -> true
            "ранее кастрирован" -> true
            "ранее стер.и чипир." -> true
            "ранее стерилизо-вана" -> true
            "ранее стерилизован" -> true
            "ранее стерилизована" -> true
            "стерилизация по возрасту" -> true
            else -> null
        }
    }
}