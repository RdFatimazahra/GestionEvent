package gestionevents.repository;

import gestionevents.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Utilisateur, Integer> {

    Utilisateur findByIdUser(int iduser);
    Optional<Utilisateur> findByEmail(String email);

}
