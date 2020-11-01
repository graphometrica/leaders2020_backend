package ai.graphometrica.leaders2020_backend;

import lombok.Data;

import javax.persistence.*;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public UserLevel getLevel() {
        return level;
    }

    public void setLevel(UserLevel level) {
        this.level = level;
    }

    public String getLevelAccess() {
        return levelAccess;
    }

    public void setLevelAccess(String levelAccess) {
        this.levelAccess = levelAccess;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
