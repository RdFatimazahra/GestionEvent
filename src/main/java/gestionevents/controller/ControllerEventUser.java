package gestionevents.controller;

import gestionevents.model.Events;
import gestionevents.service.ContactServiceImpl;
import gestionevents.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth/User/events")
public class ControllerEventUser {

    @Autowired
    private EventServiceImpl  eventService ;


    @GetMapping("/{id}")
    public Events getEventById(@PathVariable int id) {
        return eventService.getEventById(id);
    }
}
