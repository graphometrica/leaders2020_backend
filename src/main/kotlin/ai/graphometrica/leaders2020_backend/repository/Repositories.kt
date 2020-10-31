package ai.graphometrica.leaders2020_backend.repository

import ai.graphometrica.leaders2020_backend.model.entity.AnimalEntity
import ai.graphometrica.leaders2020_backend.model.entity.AnimalMovementEntity
import ai.graphometrica.leaders2020_backend.model.entity.AnimalTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.BreedTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.ColorTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.DeathReasonEntity
import ai.graphometrica.leaders2020_backend.model.entity.DistrictEntity
import ai.graphometrica.leaders2020_backend.model.entity.EarTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.EmployeeEntity
import ai.graphometrica.leaders2020_backend.model.entity.EndoparasitesEntity
import ai.graphometrica.leaders2020_backend.model.entity.EuthanasiaTypesEntity
import ai.graphometrica.leaders2020_backend.model.entity.GenderTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.HealthCheckEntity
import ai.graphometrica.leaders2020_backend.model.entity.OperatingOrganizationEntity
import ai.graphometrica.leaders2020_backend.model.entity.ShelterEntity
import ai.graphometrica.leaders2020_backend.model.entity.ShelterExitReasonEntity
import ai.graphometrica.leaders2020_backend.model.entity.TailTypeEntity
import ai.graphometrica.leaders2020_backend.model.entity.VaccinationEntity
import ai.graphometrica.leaders2020_backend.model.entity.WoolTypeEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
interface AnimalRepository : CrudRepository<AnimalEntity, String> {}
@RepositoryRestResource(collectionResourceRel = "animalMovement", path = "animalMovement")
interface AnimalMovementRepository : CrudRepository<AnimalMovementEntity, String> {}
@RepositoryRestResource(collectionResourceRel = "animal-type", path = "animal-type")
interface AnimalTypeRepository : CrudRepository<AnimalTypeEntity, String> { fun getByName(name : String) : AnimalTypeEntity }
@RepositoryRestResource(collectionResourceRel = "breed-type", path = "breed-type")
interface BreedTypeRepository : CrudRepository<BreedTypeEntity, String> { fun getByName(name : String) : BreedTypeEntity }
@RepositoryRestResource(collectionResourceRel = "color-type", path = "color-type")
interface ColorTypeRepository : CrudRepository<ColorTypeEntity, String> { fun getByName(name : String) : ColorTypeEntity }
@RepositoryRestResource(collectionResourceRel = "death-reason", path = "death-reason")
interface DeathReasonRepository : CrudRepository<DeathReasonEntity, String> { fun getByName(name : String) : DeathReasonEntity }
@RepositoryRestResource(collectionResourceRel = "ear-type", path = "ear-type")
interface EarTypeRepository : CrudRepository<EarTypeEntity, String> { fun getByName(name : String) : EarTypeEntity }
@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
interface EmployeeERepository : CrudRepository<EmployeeEntity, String> {}
@RepositoryRestResource(collectionResourceRel = "endoparasites", path = "endoparasites")
interface EndoparasitesERepository : CrudRepository<EndoparasitesEntity, String> {}
@RepositoryRestResource(collectionResourceRel = "euthanasia-types", path = "euthanasia-types")
interface EuthanasiaTypesRepository : CrudRepository<EuthanasiaTypesEntity, String> { fun getByName(name : String) : EuthanasiaTypesEntity }
@RepositoryRestResource(collectionResourceRel = "gender-type", path = "gender-type")
interface GenderTypeRepository : CrudRepository<GenderTypeEntity, String> { fun getByName(name : String) : GenderTypeEntity }
@RepositoryRestResource(collectionResourceRel = "health-check", path = "health-check")
interface HealthCheckRepository : CrudRepository<HealthCheckEntity, String> {}
@RepositoryRestResource(collectionResourceRel = "operating-organization", path = "operating-organization")
interface OperatingOrganizationRepository : CrudRepository<OperatingOrganizationEntity, String> { fun getByName(name : String) : OperatingOrganizationEntity }
@RepositoryRestResource(collectionResourceRel = "shelter", path = "shelter")
interface ShelterERepository : CrudRepository<ShelterEntity, String> {fun getByAddress(address: String) : ShelterEntity}
@RepositoryRestResource(collectionResourceRel = "shelter-exit-reason", path = "shelter-exit-reason")
interface ShelterExitRepository : CrudRepository<ShelterExitReasonEntity, String> { fun getByName(name : String) : ShelterExitReasonEntity }
@RepositoryRestResource(collectionResourceRel = "tail-type", path = "tail-type")
interface TailTypeRepository : CrudRepository<TailTypeEntity, String> { fun getByName(name : String) : TailTypeEntity }
@RepositoryRestResource(collectionResourceRel = "vaccination", path = "vaccination")
interface VaccinationERepository : CrudRepository<VaccinationEntity, String> {}
@RepositoryRestResource(collectionResourceRel = "wool-type", path = "wool-type")
interface WoolTypeRepository : CrudRepository<WoolTypeEntity, String> { fun getByName(name : String) : WoolTypeEntity }
@RepositoryRestResource(collectionResourceRel = "district", path = "district")
interface DistrictRepository : CrudRepository<DistrictEntity, String> { fun getByName(name : String) : DistrictEntity }