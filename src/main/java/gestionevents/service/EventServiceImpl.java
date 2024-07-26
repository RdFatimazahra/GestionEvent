package gestionevents.service;

import gestionevents.model.Events;
import gestionevents.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Events> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Events getEventById(int id) {
        Optional<Events> event = eventRepository.findById(id);
        return event.orElse(null);
    }

    @Override
    public Events createEvent(Events event) {

        return eventRepository.save(event);
    }

    @Override
    public Events updateEvent(int id, Events event) {
        Optional<Events> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()) {
            Events existingEvent = optionalEvent.get();
            existingEvent.setName(event.getName());
            existingEvent.setDescription(event.getDescription());
            existingEvent.setDate(event.getDate());
            existingEvent.setCategory(event.getCategory());
            existingEvent.setReservations(event.getReservations());
            return eventRepository.save(existingEvent);
        } else {
            return null; // or throw an exception if preferred
        }

        }


    @Override
    public void deleteEvent(int id) {
        eventRepository.deleteById(id);

    }


}
