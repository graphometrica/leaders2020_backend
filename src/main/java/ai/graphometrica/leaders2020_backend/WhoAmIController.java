package ai.graphometrica.leaders2020_backend;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhoAmIController {

    @GetMapping("/whoami")
    public UserEntity getUser() {
        return ((CustomUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getEntity();
    }

}
