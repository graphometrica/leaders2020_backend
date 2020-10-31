package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.AdministrativeDistrictEntity
import org.springframework.data.repository.CrudRepository

interface AdministrativeDistrictRepository : CrudRepository<AdministrativeDistrictEntity, String> {
    fun findByName(name : String) : AdministrativeDistrictEntity
}