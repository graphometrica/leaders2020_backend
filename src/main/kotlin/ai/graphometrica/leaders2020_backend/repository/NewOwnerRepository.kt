package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.NewOwnerEntity
import org.springframework.data.repository.CrudRepository

interface NewOwnerRepository : CrudRepository<NewOwnerEntity, String> {
}