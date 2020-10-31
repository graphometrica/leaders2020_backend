package ai.graphometrica.leaders2020_backend.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "operating_organization")
class OperatingOrganizationEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var name : String? = null

    @Column
    var address : String? = null

    @Column
    var phone : String? = null

    @Column
    var bossEmployeeId : String? = null

    @Column
    var districtId : String? = null
}