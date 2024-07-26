package gestionevents.controller;


import gestionevents.model.Contact;
import gestionevents.model.Reservation;
import gestionevents.service.ContactServiceImpl;
import gestionevents.service.ReservationServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/auth/User/reservation")
public class ReservationController {

    @Autowired
    private ReservationServieImpl reservationServicimpl;

    @GetMapping

    public List<Reservation> getAllReservations() {
        return reservationServicimpl.getAllReservations();
    }


    @PostMapping
    public Reservation saveResevation(@RequestBody Reservation reservation) {
        return reservationServicimpl.savereservation(reservation);
    }

}
