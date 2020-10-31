package ai.graphometrica.leaders2020_backend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/auth")
    public UserEntity auth(HttpServletRequest req, @RequestBody Map<String, String> data) {
        return authService.auth(req, data.get("username"), data.get("password"));
    }

}
