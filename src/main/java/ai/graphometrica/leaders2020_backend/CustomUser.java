package ai.graphometrica.leaders2020_backend;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;

public class CustomUser extends User {

    private final UserEntity entity;

    public CustomUser(UserEntity entity) {
        super(entity.getLogin(), entity.getSecret(), new ArrayList<>());
        var authorities = new ArrayList<GrantedAuthority>();
        if(entity.getLevel() == UserLevel.SHELTER) {
            authorities = new ArrayList<>() {{
                add(new SimpleGrantedAuthority("SHELTER"));
            }};
        }

        this.entity = entity;
    }

    public UserEntity getEntity() {
        return entity;
    }
}
