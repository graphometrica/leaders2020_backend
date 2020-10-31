package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.CuratorEntity
import org.springframework.data.repository.CrudRepository

interface CuratorRepository : CrudRepository<CuratorEntity, String> {
}