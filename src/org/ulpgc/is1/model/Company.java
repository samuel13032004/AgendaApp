package org.ulpgc.is1.model;

public class Company extends Contact{

    private final String name;
    private final String description;

    public Company(String name, String phone, String email, String street, int number, int floor, String city) {
        super();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    public Company(String name, String description){

        this.name = name;
        this.description = description;
    }
}
