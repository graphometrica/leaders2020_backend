package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "general_info")
class GeneralInfoEntity{

    @Id
    var general_info_id = UUID.randomUUID().toString()
    @Column
    var cardNumber : String? = null
    @Column
    var type : String? = null
    @Column
    var year : String? = null
    @Column
    var weight : String? = null
    @Column
    var nickname : String? = null
    @Column
    var gender : String? = null
    @Column
    var breed : String? = null
    @Column
    var color : String? = null
    @Column
    var wool : String? = null
    @Column
    var ears : String? = null
    @Column
    var tail : String? = null
    @Column
    var size : String? = null
    @Column
    var specialSigns : String? = null
    @Column
    var aviary : String? = null
    @Column
    var shelter : String? = null
    @Column
    var administrativeDistrict : String? = null
}