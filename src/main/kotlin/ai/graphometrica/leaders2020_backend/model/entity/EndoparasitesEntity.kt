package ai.graphometrica.leaders2020_backend.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "endoparasites")
class EndoparasitesEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var animalId : String? = null

    @Column
    var position : String? = null

    @Column
    var date : Date? = null

    @Column
    var medicationName : String? = null

    @Column
    var serialNumber : String? = null

    @Column
    var dose : Double? = null
}