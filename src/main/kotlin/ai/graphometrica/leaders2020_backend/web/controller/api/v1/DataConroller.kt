package ai.graphometrica.leaders2020_backend.web.controller.api.v1
//
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//
//@RestController
//@RequestMapping("/api/v1")
//class DataConroller(
//) {
//
//    @GetMapping("/getAll")
//    fun getAll(): List<AllData> {
//        return generalInfoRepository.findAll().map {
//            AllData().apply {
//                generalInfo = it
//                additionalInfoEntity = try {additionalInfoRepository.findByGeneralInfo(it.generalInfoId)} catch (e: Exception) {null}
//                catchInfoEntity =  try {catchInfoRepository.findByGeneralInfo(it.generalInfoId)} catch (e: Exception) {null}
//            }
//        }
//    }
//}
//
//class AllData() {
//    var generalInfo: GeneralInfoEntity? = null
//    var additionalInfoEntity: AdditionalInfoEntity? = null
//    var catchInfoEntity: CatchInfoEntity? = null
//
//}