package gestionevents.repository;

import gestionevents.model.Contact;
import gestionevents.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository  extends JpaRepository<Reservation,Integer > {

}
