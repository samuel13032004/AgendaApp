package org.ulpgc.is1.model;

public class Person extends Contact{

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName){
        super(this.getTelephone(), this.getEmail());

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName , String lastName, String phone, String email, String street, int number, int floor, String city) {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public String getName(String firstName, String lastName) {
        return this.firstName + " " + this.lastName;
    }
}
