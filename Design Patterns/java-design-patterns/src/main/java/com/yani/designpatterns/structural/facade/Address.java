package com.yani.designpatterns.structural.facade;

public class Address {
    private String id;
    private String streetName;
    private String city;

    public Address(String id, String streetName, String city) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }
}
