package ai.graphometrica.leaders2020_backend.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "animal_movement")
class AnimalMovementEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var movementType : String? = null

    @Column
    var admissionDate : Date? = null

    @Column
    var admissionActNumber : String? = null

    @Column
    var shelterExitDate : Date? = null

    @Column
    var shelterExitActNumber : String? = null

    @Column
    var shelterExitReasonId : String? = null

    @Column
    var deathReasonId : String? = null

    @Column
    var euthanasiaTypeId : String? = null
}