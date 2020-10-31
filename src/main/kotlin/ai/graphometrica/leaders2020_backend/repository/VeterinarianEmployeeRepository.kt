package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.VeterinarianEmployeeEntity
import org.springframework.data.repository.CrudRepository

interface VeterinarianEmployeeRepository : CrudRepository<VeterinarianEmployeeEntity, String> {
    fun findByName(name: String) : VeterinarianEmployeeEntity
}