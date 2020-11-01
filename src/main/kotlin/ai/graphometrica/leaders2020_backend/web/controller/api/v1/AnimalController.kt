package ai.graphometrica.leaders2020_backend.web.controller.api.v1

import ai.graphometrica.leaders2020_backend.CustomUser
import ai.graphometrica.leaders2020_backend.UserLevel
import ai.graphometrica.leaders2020_backend.model.entity.AnimalEntity
import ai.graphometrica.leaders2020_backend.repository.AnimalRepository
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class AnimalController(val animalRepository: AnimalRepository) {

    @GetMapping("/getAllAnimals")
    fun getAnimals() : Iterable<AnimalEntity> {
        val user = (SecurityContextHolder.getContext().authentication.principal as CustomUser).entity
        return when (user.level) {
            UserLevel.DEPARTMENT -> animalRepository.findAll();
            UserLevel.DISTRICT -> animalRepository.findAllByDistrictId(user.levelAccess);
            UserLevel.SHELTER -> animalRepository.findAllByShelterId(user.levelAccess);
            UserLevel.ORGANIZATION -> animalRepository.findAllByOperatingOrganizationId(user.levelAccess);
            else -> listOf()
        }
    }
}