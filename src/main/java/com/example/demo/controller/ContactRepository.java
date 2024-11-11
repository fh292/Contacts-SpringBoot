package com.example.demo.controller;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactRepository {
    private List<Contact> contactsList = new ArrayList<>();

    public List<Contact> getContactsList() {
        return contactsList;
    }

    public boolean isEmpty() {
        return contactsList.isEmpty();
    }

    public void addContact(Contact contact) {
        contactsList.add(contact);
    }

    public Contact getContact(String name){
        for (Contact contact : contactsList) {
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
}
