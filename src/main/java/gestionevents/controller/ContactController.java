package gestionevents.controller;


import gestionevents.model.Contact;
import gestionevents.service.ContactService;
import gestionevents.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/Admin/contacts")
public class ContactController {
    @Autowired
    private ContactServiceImpl contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getContacts();
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }

}