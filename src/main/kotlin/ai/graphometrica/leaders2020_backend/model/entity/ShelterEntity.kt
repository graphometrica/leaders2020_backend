package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "shelter")
class ShelterEntity{

    @Id
    var shelterId = UUID.randomUUID().toString()

    @Column
    var adress : String? = null

    @Column
    var serviceOrganization : String? = null

    @Column
    var bossEmployee : String? = null

    @Column
    var careEmployee : String? = null
}