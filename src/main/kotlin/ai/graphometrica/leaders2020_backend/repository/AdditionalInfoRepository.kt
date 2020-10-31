package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.AdditionalInfoEntity
import org.springframework.data.repository.CrudRepository

interface AdditionalInfoRepository : CrudRepository<AdditionalInfoEntity, String> {
}