package ai.graphometrica.leaders2020_backend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {

    Optional<UserEntity> findByLogin(String login);

//    private static final String DIS_1 = UUID.randomUUID().toString();
//    private static final String DIS_2 = UUID.randomUUID().toString();
//    private static final String ORG_1 = UUID.randomUUID().toString();
//    private static final String ORG_2 = UUID.randomUUID().toString();
//    private static final String SHEL_1 = UUID.randomUUID().toString();
//    private static final String SHEL_2 = UUID.randomUUID().toString();
//    private static final String SHEL_3 = UUID.randomUUID().toString();
//
//    public UserEntity findByLogin(String login) {
//        var  user = new UserEntity();
//        user.setId(UUID.randomUUID().toString());
//        user.setSecret("{SHA-256}a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3");
//        user.setLogin(login);
//
//        switch (login) {
//            case "department":
//                user.setLevel(UserLevel.DEPARTMENT);
//                break;
//            case "district1":
//                user.setLevel(UserLevel.DISTRICT);
//                user.setLevelAccess(DIS_1);
//                break;
//            case "district2":
//                user.setLevel(UserLevel.DEPARTMENT);
//                user.setLevelAccess(DIS_2);
//                break;
//            case "organization1":
//                user.setLevel(UserLevel.ORGANIZATION);
//                user.setLevelAccess(ORG_1);
//                break;
//            case "organization2":
//                user.setLevel(UserLevel.ORGANIZATION);
//                user.setLevelAccess(SHEL_1);
//                break;
//            case "shelter1":
//                user.setLevel(UserLevel.SHELTER);
//                user.setLevelAccess(SHEL_2);
//                break;
//            case "shelter2":
//                user.setLevel(UserLevel.SHELTER);
//                user.setLevelAccess(SHEL_3);
//                break;
//            case "shelter3":
//                user.setLevel(UserLevel.SHELTER);
//                user.setLevelAccess(ORG_2);
//                break;
//            default:
//                throw new UsernameNotFoundException("User with login " + login + "  is not found");
//        }
//
//        return user;
//    }
}
