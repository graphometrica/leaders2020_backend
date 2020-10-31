package ai.graphometrica.leaders2020_backend.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "health_check")
class HealthCheckEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var animalId : String? = null

    @Column
    var date : Date? = null

    @Column
    var weight : Double? = null

    @Column
    var anamnesis : String? = null
}