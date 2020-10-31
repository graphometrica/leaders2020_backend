package ai.graphometrica.leaders2020_backend.model.entity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "catch_order")
class CatchOrderEntity{

    @Id
    var catch_order_id = UUID.randomUUID().toString()

    @Column
    var catchOrderActNumber : String? = null

    @Column
    var catchOrderActDate : Date? = null
}