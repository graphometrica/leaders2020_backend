package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.CareEmployeeEntity
import org.springframework.data.repository.CrudRepository

interface CareEmployeeRepository : CrudRepository<CareEmployeeEntity, String> {
    fun findByName(name : String) : CareEmployeeEntity
}