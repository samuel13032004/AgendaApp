package org.ulpgc.is1.model;

public class Address {

    private String street;
    private int number;
    private int floor;
    private String city;

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public String getCity() {
        return city;
    }

    public void setAddress(String street, int number, int floor, String city){

        this.street = street;
        this.number = number;
        this.floor = floor;
        this.city = city;
    }
}
