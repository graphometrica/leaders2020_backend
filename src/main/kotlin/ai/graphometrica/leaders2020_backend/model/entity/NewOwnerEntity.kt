package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "new_owner")
class NewOwnerEntity{

    @Id
    var new_owner_id = UUID.randomUUID().toString()

    @Column
    var type : String? = null

    @Column
    var name : String? = null

    @Column
    var documentNumber : String? = null

    @Column
    var curator : String? = null

    @Column
    var general_info : String? = null

}