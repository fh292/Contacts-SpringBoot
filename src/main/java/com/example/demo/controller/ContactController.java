package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    ContactRepository contactsList = new ContactRepository();


    //Create 'Add Contact' Endpoint:
    @PostMapping("/addContact")
    String addContact(@RequestBody Contact contact) {
        contactsList.addContact(contact);
        return "Contact added successfully!";
    }

    //Create 'Get Contact Details' Endpoint:
    @GetMapping("/getContactDetails")
    String getContactDetails(@RequestParam String name) {
        Contact contact = contactsList.getContact(name);
        return "Contact " +contact.getName() +" details: Email: "+contact.getEmail()+ ", Phone Number: "+contact.getPhone();

    }

}
