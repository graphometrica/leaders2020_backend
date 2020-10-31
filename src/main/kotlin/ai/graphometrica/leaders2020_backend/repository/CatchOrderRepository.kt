package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.CatchOrderEntity
import org.springframework.data.repository.CrudRepository

interface CatchOrderRepository : CrudRepository<CatchOrderEntity, String> {
    fun findByCatchOrderActNumber(number : String) : CatchOrderEntity
}