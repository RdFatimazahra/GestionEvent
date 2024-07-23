package gestionevents.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    private String reservationDate;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "idEvent")
    private Events event;



}
