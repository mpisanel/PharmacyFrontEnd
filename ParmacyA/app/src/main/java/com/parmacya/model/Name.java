package com.parmacya.model;

/**
 * Created by SONY on 2016-08-23.
 */
public class Name {

    private String firstName;
    private String lastName;

    public Name(){}

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
