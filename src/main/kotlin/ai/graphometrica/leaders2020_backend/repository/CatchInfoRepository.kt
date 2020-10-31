package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.AdditionalInfoEntity
import ai.graphometrica.leaders2020_backend.model.entity.CatchInfoEntity
import ai.graphometrica.leaders2020_backend.model.entity.CuratorEntity
import org.springframework.data.repository.CrudRepository

interface CatchInfoRepository : CrudRepository<CatchInfoEntity, String> {
    fun findByGeneralInfo(generalInfoId : String) : CatchInfoEntity
}