package org.ulpgc.is1.model;

public abstract class Contact {

    private final String telephone;
    private final String email;
    private Company company;
    private Person person;

    private Address address;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Contact(String telephone, String email, Address address
    ){

        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public void setAddress(String street, int number, int
            floor, String city) {
        this.address = new Address(street, number, floor, city);
    }

    @Override
    public void getName(Company company, Person person) {
        super.getName(company, person);
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void getName(Company company, Person person){

        this.company = company;
        this.person = person;
    }
}
