package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.GeneralInfoEntity
import org.springframework.data.repository.CrudRepository

interface GeneralInfoRepository : CrudRepository<GeneralInfoEntity, String> {
    fun findByCardNumber(cardNumber : String) : GeneralInfoEntity
}