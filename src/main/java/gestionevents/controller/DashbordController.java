package gestionevents.controller;


import gestionevents.auth.AuthenticationService;
import gestionevents.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth/Admin")
public class DashbordController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private EventServiceImpl eventService;

    @GetMapping("/countUser")
    public Long countUser() {
        return  authenticationService.count();
    }

    @GetMapping("/countEvent")
    public Long countEvent() {
        return eventService.count();
    }
}
