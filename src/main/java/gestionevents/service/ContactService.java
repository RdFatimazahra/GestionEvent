package gestionevents.service;

import gestionevents.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getContacts();
    Contact addContact(Contact contact);
//    Contact updateContact(Contact contact);
//    void deleteContact(Contact contact);
//    Contact getContactById(int id);
//    List<Contact> getContactsByName(String firstName, String lastName);
//    List<Contact> getContactsByEmail(String email);
}
