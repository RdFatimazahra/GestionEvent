package gestionevents.service;

import gestionevents.model.Events;

import java.util.List;

public interface EventService {
    List<Events> getAllEvents();
    Events getEventById(int id);
    Events createEvent(Events event);
    Events updateEvent(int id, Events event);
    void deleteEvent(int id);
}
