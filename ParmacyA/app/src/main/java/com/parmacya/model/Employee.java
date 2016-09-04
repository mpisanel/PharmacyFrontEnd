package com.parmacya.model;

/**
 * Created by SONY on 2016-08-23.
 */
public class Employee {
    private Long id;
    private Name name;
    private Contact contact;
    private Address address;

    public Employee() {
    }

    public Employee(Name name, Contact contact, Address address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public Employee(Long id, Name name, Contact contact, Address address) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}








