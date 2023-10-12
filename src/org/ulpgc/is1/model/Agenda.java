package org.ulpgc.is1.model;


import java.util.ArrayList;
import java.util.List;

    public class Agenda {
        private List<Contact> contactList;
        private List<Group> groupList;
        private Group group;

        public Agenda() {
            contactList = new ArrayList<>();
            groupList = new ArrayList<>();
        }

        public void addPerson(String firstName, String lastName, String phone, String email, String street, int number, int floor, String city) {
            contactList.add(new Person(firstName, lastName, phone, email, street, number, floor, city));
        }

        public void addCompany(String name, String phone, String email, String street, int number, int floor, String city) {
            contactList.add(new Company(name, phone, email, street, number, floor, city));
        }

        public void addGroup(Group group) {
            groupList.add(group);
        }

        public void addContactToGroup(Contact contact, Group group) {
            group.addContact(contact);
        }

        public void removeContactFromGroup(Contact contact, Group group) {
            group.removeContact(contact);
        }

        public void removeContact(Contact contact) {
            contactList.remove(contact);
        }

        public int getContactCount() {
            return contactList.size();
        }

        public List<Contact> getContactList() {
            return contactList;
        }

        public void setContactList(List<Contact> contactList) {
            this.contactList = contactList;
        }

        public List<Group> getGroupList() {
            return groupList;
        }

        public void setGroupList(List<Group> groupList) {
            this.groupList = groupList;
        }

        public Group getGroup() {
            return group;
        }

        public void setGroup(Group group) {
            this.group = group;
        }

        public int getContactCountInGroup(Group group) {
            this.group = group;
            return group.getContacts().size();
        }
    }


