package gestionevents.controller;


import gestionevents.model.Contact;


import gestionevents.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/auth/User/contacts")
public class ContactController {

    @Autowired
    private ContactServiceImpl contactService;

    @GetMapping

    public List<Contact> getAllConstacts() {
        return contactService.getAllConstacts();
    }


    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }


}


