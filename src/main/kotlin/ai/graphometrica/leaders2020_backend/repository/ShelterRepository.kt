package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.ShelterEntity
import org.springframework.data.repository.CrudRepository

interface ShelterRepository : CrudRepository<ShelterEntity, String> {
    fun findByAdress(adress : String) : ShelterEntity
}