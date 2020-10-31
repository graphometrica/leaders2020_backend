package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "administrative_district")
class AdministrativeDistrictEntity{

    @Id
    var administrative_district_id = UUID.randomUUID().toString()

    @Column
    var name : String? = null
}