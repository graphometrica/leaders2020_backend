package ai.graphometrica.leaders2020_backend.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "employee")
class EmployeeEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var name : String? = null

    @Column
    var positionName : String? = null

    @Column
    var shelterId : String? = null

    @Column
    var districtId : String? = null

    @Column
    var operatingOrganizationId : String? = null
}