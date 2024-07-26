package gestionevents.service;

import gestionevents.model.Contact;
import gestionevents.model.Events;

import java.util.List;

public interface ContactService {
    List<Contact> getAllConstacts();
    Contact saveContact(Contact contact);


}
