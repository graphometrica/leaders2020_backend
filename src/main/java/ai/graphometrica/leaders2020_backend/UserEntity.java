package ai.graphometrica.leaders2020_backend;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private String id;
    private String login;
    private String fullName;
    private String secret;
    @Enumerated(EnumType.STRING)
    private UserLevel level;
    private String levelAccess;
    private Boolean enabled;
}
