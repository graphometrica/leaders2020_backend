package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "curator")
class CuratorEntity{

    @Id
    var curator_id = UUID.randomUUID().toString()

    @Column
    var name : String? = null
}