package gestionevents.controller;

<<<<<<< HEAD
import gestionevents.model.Contact;
import gestionevents.model.Events;
=======

import gestionevents.model.Contact;
>>>>>>> f79a85aa5df5bcf321a9b8d030c606f0e9cfa406
import gestionevents.service.ContactService;
import gestionevents.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
<<<<<<< HEAD
@RequestMapping("/api/v1/auth/User/contacts")
public class ContactController {

=======
@RequestMapping("/api/v1/auth/Admin/contacts")
public class ContactController {
>>>>>>> f79a85aa5df5bcf321a9b8d030c606f0e9cfa406
    @Autowired
    private ContactServiceImpl contactService;

    @GetMapping
<<<<<<< HEAD
    public List<Contact> getAllConstacts() {
        return contactService.getAllConstacts();
    }


    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }


}


=======
    public List<Contact> getAllContacts() {
        return contactService.getContacts();
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }

}
>>>>>>> f79a85aa5df5bcf321a9b8d030c606f0e9cfa406
