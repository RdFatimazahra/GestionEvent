package gestionevents.controller;


import gestionevents.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth/Admin/countUser")
public class DashbordController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping
    public Long countUser() {
        return  authenticationService.count();
    }
}
