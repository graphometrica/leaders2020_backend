package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.BossEmployeeEntity
import org.springframework.data.repository.CrudRepository

interface BossEmployeeRepository : CrudRepository<BossEmployeeEntity, String> {

    fun findByName(name : String) : BossEmployeeEntity
}