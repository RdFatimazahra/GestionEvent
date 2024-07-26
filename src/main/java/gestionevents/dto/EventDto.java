package gestionevents.dto;

import gestionevents.model.Reservation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EventDto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idEvent;
        private String name;
        private String description;
        private String date;
        private String category;

    }

