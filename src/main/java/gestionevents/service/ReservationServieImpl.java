package gestionevents.service;

import gestionevents.model.Contact;
import gestionevents.model.Reservation;
import gestionevents.repository.ContactRepository;
import gestionevents.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ReservationServieImpl  implements ReservationService{

   @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation savereservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
