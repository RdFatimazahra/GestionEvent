package gestionevents.service;

import gestionevents.model.Contact;
import gestionevents.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllConstacts() {
        return contactRepository.findAll();
    }

    @Override

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
