package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "catch_info")
class CatchInfoEntity{

    @Id
    var catch_info_id = UUID.randomUUID().toString()

    @Column
    var act_number : String? = null

    @Column
    var address : String? = null

    @Column
    var catch_order : String? = null

    @Column
    var administrative_district : String? = null

    @Column
    var general_info : String? = null
}