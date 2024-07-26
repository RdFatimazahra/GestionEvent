package gestionevents.repository;

import gestionevents.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Events, Integer> {

}
