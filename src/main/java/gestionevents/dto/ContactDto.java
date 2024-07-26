package gestionevents.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContactDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContact;
    private String name;
    private String email;
    private String message;
    private String requestDate;
}
