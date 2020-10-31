package ai.graphometrica.leaders2020_backend.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "animal")
class AnimalEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var pictureId: Int? = null

    @Column
    var cardNumber: String? = null

    @Column
    var animalTypeId: String? = null

    @Column
    var districtId: String? = null

    @Column
    var operatingOrganizationId: String? = null

    @Column
    var shelterId: String? = null

    @Column
    var year: String? = null

    @Column
    var weight: String? = null

    @Column
    var nickname: String? = null

    @Column
    var genderId: String? = null

    @Column
    var breedId: String? = null

    @Column
    var colorId: String? = null

    @Column
    var woolTypeId: String? = null

    @Column
    var earTypeId: String? = null

    @Column
    var tailTypeId: String? = null

    @Column
    var size: Double? = null

    @Column
    var specialSigns: String? = null

    @Column
    var aviary: String? = null

    @Column
    var identificationMark: String? = null

    @Column
    var careEmployeeId: String? = null

    @Column
    var isSterilized: Boolean? = null

    @Column
    var sterilizationDate: String? = null

    @Column
    var sterilizationComment: String? = null

    @Column
    var veterinarianEmployeeId: String? = null

    @Column
    var isSocialized: Boolean? = null

    @Column
    var catchActNumber: String? = null

    @Column
    var catchActDate: String? = null

    @Column
    var catchOrderNumber: String? = null

    @Column
    var catchOrderDate: String? = null

    @Column
    var catchAddressValue: String? = null

    @Column
    var catchAddressLatitude: String? = null

    @Column
    var catchAddressLongitude: String? = null

    @Column
    var catchVideo: String? = null

    @Column
    var addressValue: String? = null

    @Column
    var addressFias: String? = null

    @Column
    var addressLatitude: String? = null

    @Column
    var addressLongitude: String? = null

    @Column
    var newOwnerType: String? = null

    @Column
    var newOwnerPeName: String? = null

    @Column
    var newOwnerPePassNumber: String? = null

    @Column
    var newOwnerPePassSerial: String? = null

    @Column
    var newOwnerPePassIssuedBy: String? = null

    @Column
    var newOwnerPePassIssueDate: String? = null

    @Column
    var newOwnerPeRegistrationAddress: String? = null

    @Column
    var newOwnerContact: String? = null

    @Column
    var newOwnerLeName: String? = null

    @Column
    var newOwnerLePhone: String? = null

    @Column
    var newOwnerLeAddress: String? = null

    @Column
    var newOwnerGuardians: String? = null

    @Column
    var animalMovementId: String? = null
}