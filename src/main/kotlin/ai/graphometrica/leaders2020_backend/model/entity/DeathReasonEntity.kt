package ai.graphometrica.leaders2020_backend.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "death_reasons")
class DeathReasonEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var name : String? = null
}