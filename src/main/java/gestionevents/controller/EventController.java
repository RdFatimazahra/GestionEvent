package gestionevents.controller;


import gestionevents.model.Events;
import gestionevents.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/Admin/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Events> getEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("")
    public Events addEvent(@RequestBody Events event) {
       return eventService.createEvent(event);
    }

    @PutMapping("/{id}")
    public Events updateEvent(@PathVariable int id, @RequestBody Events event) {
        event.setIdEvent(id);
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable int id) {
          eventService.deleteEvent(id);
    }



}
