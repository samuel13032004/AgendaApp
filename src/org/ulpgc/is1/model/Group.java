package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Contact> contacts;
    private List<LocalDateTime> joinDates;

    public Group(String name) {
        this.name = name;
        contacts = new ArrayList<>();
        joinDates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        // Track the join date for the contact
        joinDates.add(LocalDateTime.now());
    }

    public void removeContact(Contact contact) {
        int index = contacts.indexOf(contact);
        if (index != -1) {
            contacts.remove(index);
            joinDates.remove(index);
        }
    }

    public int getContactCount() {
        return contacts.size();
    }
}

