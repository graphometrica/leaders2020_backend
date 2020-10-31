package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "catch_info")
class CatchInfoEntity{

    @Id
    var catchInfoId = UUID.randomUUID().toString()

    @Column
    var actNumber : String? = null

    @Column
    var address : String? = null

    @Column
    var catchOrder : String? = null

    @Column
    var administrativeDistrict : String? = null

    @Column
    var generalInfo : String? = null
}