package gestionevents.service;

import gestionevents.model.Contact;
import gestionevents.model.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Reservation savereservation(Reservation reservation);

}
