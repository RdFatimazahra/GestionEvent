package gestionevents.repository;

import gestionevents.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer >{

}
