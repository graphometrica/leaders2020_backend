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

interface AnimalRepository : CrudRepository<AnimalEntity, String> {}
interface AnimalMovementRepository : CrudRepository<AnimalMovementEntity, String> {}
interface AnimalTypeRepository : CrudRepository<AnimalTypeEntity, String> { fun getByName(name : String) : AnimalTypeEntity }
interface BreedTypeRepository : CrudRepository<BreedTypeEntity, String> { fun getByName(name : String) : BreedTypeEntity }
interface ColorTypeRepository : CrudRepository<ColorTypeEntity, String> { fun getByName(name : String) : ColorTypeEntity }
interface DeathReasonRepository : CrudRepository<DeathReasonEntity, String> { fun getByName(name : String) : DeathReasonEntity }
interface EarTypeRepository : CrudRepository<EarTypeEntity, String> { fun getByName(name : String) : EarTypeEntity }
interface EmployeeERepository : CrudRepository<EmployeeEntity, String> {}
interface EndoparasitesERepository : CrudRepository<EndoparasitesEntity, String> {}
interface EuthanasiaTypesRepository : CrudRepository<EuthanasiaTypesEntity, String> { fun getByName(name : String) : EuthanasiaTypesEntity }
interface GenderTypeRepository : CrudRepository<GenderTypeEntity, String> { fun getByName(name : String) : GenderTypeEntity }
interface HealthCheckRepository : CrudRepository<HealthCheckEntity, String> {}
interface OperatingOrganizationRepository : CrudRepository<OperatingOrganizationEntity, String> { fun getByName(name : String) : OperatingOrganizationEntity }
interface ShelterERepository : CrudRepository<ShelterEntity, String> {fun getByAddress(address: String) : ShelterEntity}
interface ShelterExitRepository : CrudRepository<ShelterExitReasonEntity, String> { fun getByName(name : String) : ShelterExitReasonEntity }
interface TailTypeRepository : CrudRepository<TailTypeEntity, String> { fun getByName(name : String) : TailTypeEntity }
interface VaccinationERepository : CrudRepository<VaccinationEntity, String> {}
interface WoolTypeRepository : CrudRepository<WoolTypeEntity, String> { fun getByName(name : String) : WoolTypeEntity }
interface DistrictRepository : CrudRepository<DistrictEntity, String> { fun getByName(name : String) : DistrictEntity }