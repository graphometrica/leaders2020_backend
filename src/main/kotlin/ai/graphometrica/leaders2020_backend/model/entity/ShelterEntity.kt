package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "shelter")
class ShelterEntity{

    @Id
    var shelter_id = UUID.randomUUID().toString()

    @Column
    var adress : String? = null

    @Column
    var serviceOrganization : String? = null

    @Column
    var boss_employee : String? = null

    @Column
    var care_employee : String? = null
}