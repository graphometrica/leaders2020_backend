package ai.graphometrica.leaders2020_backend.web.controller.api.v1

import ai.graphometrica.leaders2020_backend.model.entity.AdditionalInfoEntity
import ai.graphometrica.leaders2020_backend.model.entity.CatchInfoEntity
import ai.graphometrica.leaders2020_backend.model.entity.GeneralInfoEntity
import ai.graphometrica.leaders2020_backend.repository.AdditionalInfoRepository
import ai.graphometrica.leaders2020_backend.repository.AdministrativeDistrictRepository
import ai.graphometrica.leaders2020_backend.repository.BossEmployeeRepository
import ai.graphometrica.leaders2020_backend.repository.CareEmployeeRepository
import ai.graphometrica.leaders2020_backend.repository.CatchInfoRepository
import ai.graphometrica.leaders2020_backend.repository.CatchOrderRepository
import ai.graphometrica.leaders2020_backend.repository.CuratorRepository
import ai.graphometrica.leaders2020_backend.repository.GeneralInfoRepository
import ai.graphometrica.leaders2020_backend.repository.ShelterRepository
import ai.graphometrica.leaders2020_backend.repository.VeterinarianEmployeeRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class DataConroller(
        val bossEmployeeRepository: BossEmployeeRepository,
        val careEmployeeRepository: CareEmployeeRepository,
        val veterinarianEmployeeRepository: VeterinarianEmployeeRepository,
        val curatorRepository: CuratorRepository,
        val catchOrderRepository: CatchOrderRepository,
        val administrativeDistrictRepository: AdministrativeDistrictRepository,
        val shelterRepository: ShelterRepository,
        val generalInfoRepository: GeneralInfoRepository,
        val additionalInfoRepository: AdditionalInfoRepository,
        val catchInfoRepository: CatchInfoRepository
) {

    @GetMapping("/getAll")
    fun getAll(): List<AllData> {
        return generalInfoRepository.findAll().map {
            AllData().apply {
                generalInfo = it
                additionalInfoEntity = try {additionalInfoRepository.findByGeneralInfo(it.generalInfoId)} catch (e: Exception) {null}
                catchInfoEntity =  try {catchInfoRepository.findByGeneralInfo(it.generalInfoId)} catch (e: Exception) {null}
            }
        }
    }
}

class AllData() {
    var generalInfo: GeneralInfoEntity? = null
    var additionalInfoEntity: AdditionalInfoEntity? = null
    var catchInfoEntity: CatchInfoEntity? = null

}