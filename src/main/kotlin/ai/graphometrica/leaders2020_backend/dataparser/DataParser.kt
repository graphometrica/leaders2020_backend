package ai.graphometrica.leaders2020_backend.dataparser

import ai.graphometrica.leaders2020_backend.model.entity.AnimalEntity
import ai.graphometrica.leaders2020_backend.model.entity.AnimalTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.BreedTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.ColorTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.DistrictEntity
import ai.graphometrica.leaders2020_backend.model.entity.EarTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.GenderTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.OperatingOrganizationEntity
import ai.graphometrica.leaders2020_backend.model.entity.ShelterEntity
import ai.graphometrica.leaders2020_backend.model.entity.ShelterExitReasonEntity
import ai.graphometrica.leaders2020_backend.model.entity.TailTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.WoolTypeEntity
import ai.graphometrica.leaders2020_backend.repository.AnimalRepository
import ai.graphometrica.leaders2020_backend.repository.AnimalTypeRepository
import ai.graphometrica.leaders2020_backend.repository.BreedTypeRepository
import ai.graphometrica.leaders2020_backend.repository.ColorTypeRepository
import ai.graphometrica.leaders2020_backend.repository.DistrictRepository
import ai.graphometrica.leaders2020_backend.repository.EarTypeRepository
import ai.graphometrica.leaders2020_backend.repository.EndoparasitesERepository
import ai.graphometrica.leaders2020_backend.repository.GenderTypeRepository
import ai.graphometrica.leaders2020_backend.repository.OperatingOrganizationRepository
import ai.graphometrica.leaders2020_backend.repository.ShelterERepository
import ai.graphometrica.leaders2020_backend.repository.ShelterExitRepository
import ai.graphometrica.leaders2020_backend.repository.TailTypeRepository
import ai.graphometrica.leaders2020_backend.repository.WoolTypeRepository
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileInputStream
import javax.annotation.PostConstruct

@Service
class DataParser(
        val districtRepository: DistrictRepository,
        val animalTypeRepository: AnimalTypeRepository,
        val genderTypeRepository: GenderTypeRepository,
        val breedTypeRepository: BreedTypeRepository,
        val colorTypeRepository: ColorTypeRepository,
        val woolTypeRepository: WoolTypeRepository,
        val earTypeRepository: EarTypeRepository,
        val tailTypeRepository: TailTypeRepository,
        val exitRepository: ShelterExitRepository,
        val endoparasitesERepository: EndoparasitesERepository,
        val animalRepository: AnimalRepository,
        val operationOrganizationRepository: OperatingOrganizationRepository,
        val shelterERepository: ShelterERepository
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
        parseDistricts(sheet)
        parseAnimalType(sheet)
        parseGenderType(sheet)
        parseBreedsType(sheet)
        parseColorType(sheet)
        parseWoolType(sheet)
        parseEarType(sheet)
        parseTailType(sheet)
        parseShelterExitReason(sheet)
        //parseAnimals(sheet)
        parseShelter(sheet)
        parseOperationOrganisation(sheet)

    }

    fun parseDistricts(sheet: XSSFSheet) {
        val districtsNames: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(21).toString().toLowerCase().trim()
            districtsNames.add(name)
        }
        val districts = districtsNames
                .filter { it.isNotEmpty() }
                .map { DistrictEntity().apply { name = it } }
        districtRepository.saveAll(districts)
    }

    fun parseAnimalType(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(2).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { AnimalTypeEntity().apply { name = it } }

        animalTypeRepository.saveAll(objects)
    }

    fun parseGenderType(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(6).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { GenderTypeEntity().apply { name = it } }

        genderTypeRepository.saveAll(objects)
    }

    fun parseBreedsType(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(7).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { BreedTypeEntity().apply { name = it } }

        breedTypeRepository.saveAll(objects)
    }

    fun parseColorType(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(8).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { ColorTypeEntity().apply { name = it } }

        colorTypeRepository.saveAll(objects)
    }

    fun parseWoolType(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(9).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { WoolTypeEntity().apply { name = it } }

        woolTypeRepository.saveAll(objects)
    }

    fun parseEarType(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(10).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { EarTypeEntity().apply { name = it } }

        earTypeRepository.saveAll(objects)
    }

    fun parseTailType(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(11).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { TailTypeEntity().apply { name = it } }

        tailTypeRepository.saveAll(objects)
    }

    fun parseShelterExitReason(sheet: XSSFSheet) {
        val names: HashSet<String> = hashSetOf()
        sheet.forEach { row ->
            val name = row.getCell(39).toString().toLowerCase().trim()
            names.add(name)
        }

        val objects = names
                .filter { it.isNotEmpty() }
                .map { ShelterExitReasonEntity().apply { name = it } }

        exitRepository.saveAll(objects)
    }

    fun parseShelter(sheet: XSSFSheet) {
        val shelters : HashMap<String, ShelterEntity> = hashMapOf()
        sheet.forEach { row ->
            val entity = ShelterEntity().apply {
                address = readCell(row, 41)
                districtId = try {districtRepository.getByName(readCell(row, 21)).id} catch (e : Exception) {null}
            }
            shelters.put(entity.address!!, entity)
        }

        shelterERepository.saveAll(shelters.values)
    }

    fun parseOperationOrganisation(sheet: XSSFSheet) {
        val operationOrganizations : HashMap<String, OperatingOrganizationEntity> = hashMapOf()
        sheet.forEach { row ->
            val entity = OperatingOrganizationEntity().apply {
                name = readCell(row, 42)
                districtId = try {districtRepository.getByName(readCell(row, 21)).id} catch (e : Exception) {null}
            }
            operationOrganizations.put(entity.name!!, entity)
        }
        operationOrganizationRepository.saveAll(operationOrganizations.values)
    }

//    fun parseAnimals(sheet: XSSFSheet) {
//        sheet.forEach { row ->
//            val animal = AnimalEntity().apply {
//                cardNumber = row.getCell(1).toString()
//                animalTypeId = try {animalTypeRepository.getByName(readCell(row, 2)).id} catch (e : Exception) {null}
//                districtId = try {districtRepository.getByName(readCell(row, 21)).id} catch (e : Exception) {null}
//                operatingOrganizationId = try {operationOrganizationRepository.getByName(readCell(row, 42)).id} catch (e : Exception) {null}
//                shelterId =  try {shelterERepository.getByName(readCell(row, 42)).id} catch (e : Exception) {null}
//            }
//
//            animalRepository.save(animal)
//        }
//    }

    private fun readCell(row : Row, cellNumber : Int) : String {
        return normalizeString(row.getCell(cellNumber).toString())
    }

    private fun normalizeString(string : String) :String {
        return string.toLowerCase().trim()
    }


}