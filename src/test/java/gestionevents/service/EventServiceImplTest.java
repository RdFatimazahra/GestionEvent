package gestionevents.service;

import gestionevents.model.Events;
import gestionevents.repository.EventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class EventServiceImplTest {
    @Mock
    private EventRepository eventRepository;

    @InjectMocks
    private EventServiceImpl eventService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllEvents() {
        Events event1 = new Events();
        event1.setIdEvent(1);
        event1.setName("Event 1");

        Events event2 = new Events();
        event2.setIdEvent(2);
        event2.setName("Event 2");

        List<Events> eventsList = Arrays.asList(event1, event2);

        when(eventRepository.findAll()).thenReturn(eventsList);

        List<Events> result = eventService.getAllEvents();

        assertEquals(2, result.size());
        assertEquals("Event 1", result.get(0).getName());
        assertEquals("Event 2", result.get(1).getName());
    }

    @Test
    void getEventById() {
        Events event = new Events();
        event.setIdEvent(1);
        event.setName("Event 1");

        when(eventRepository.findById(1)).thenReturn(Optional.of(event));

        Events result = eventService.getEventById(1);

        assertNotNull(result);
        assertEquals("Event 1", result.getName());
    }

    @Test
    void createEvent() {
        Events event = new Events();
        event.setIdEvent(1);
        event.setName("Event 1");

        when(eventRepository.save(event)).thenReturn(event);

        Events result = eventService.createEvent(event);

        assertNotNull(result);
        assertEquals("Event 1", result.getName());
    }

    @Test
    void updateEvent() {
        Events existingEvent = new Events();
        existingEvent.setIdEvent(1);
        existingEvent.setName("Existing Event");

        Events updatedEvent = new Events();
        updatedEvent.setIdEvent(1);
        updatedEvent.setName("Updated Event");

        when(eventRepository.findById(1)).thenReturn(Optional.of(existingEvent));
        when(eventRepository.save(existingEvent)).thenReturn(updatedEvent);

        Events result = eventService.updateEvent(1, updatedEvent);

        assertNotNull(result);
        assertEquals("Updated Event", result.getName());
    }

    @Test
    void deleteEvent() {
    }

    @Test
    void count() {
    }
}