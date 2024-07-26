package gestionevents.repository;

import gestionevents.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EventRepository extends JpaRepository<Events, Integer> {

    @Query(value = "select count(*) from Events ")
    long count();
}
