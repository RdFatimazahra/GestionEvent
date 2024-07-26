package gestionevents.service;

import gestionevents.model.Contact;
import gestionevents.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
<<<<<<< HEAD
=======

>>>>>>> f79a85aa5df5bcf321a9b8d030c606f0e9cfa406
    @Autowired
    private ContactRepository contactRepository;

    @Override
<<<<<<< HEAD
    public List<Contact> getAllConstacts() {
=======
    public List<Contact> getContacts() {
>>>>>>> f79a85aa5df5bcf321a9b8d030c606f0e9cfa406
        return contactRepository.findAll();
    }

    @Override
<<<<<<< HEAD
    public Contact saveContact(Contact contact) {
=======
    public Contact addContact(Contact contact) {
>>>>>>> f79a85aa5df5bcf321a9b8d030c606f0e9cfa406
        return contactRepository.save(contact);
    }
}
