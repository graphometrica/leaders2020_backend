package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "additional_info")
class AdditionalInfoEntity{

    @Id
    var additional_info_id = UUID.randomUUID().toString()

    @Column
    var identificationMark : String? = null

    @Column
    var isSterilized : Boolean? = null

    @Column
    var sterilizationDate : Date? = null

    @Column
    var sterilizationComment : String? = null

    @Column
    var isSocialized : Boolean? = null

    @Column
    var general_info : String? = null

    @Column
    var veterinarian_employee : String? = null
}