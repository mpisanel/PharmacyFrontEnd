package com.parmacya.model;

/**
 * Created by SONY on 2016-08-23.
 */
public class Address {
    private String postalAddress;
    private String postalCode;

    public Address() {
    }

    public Address(String postalAddress, String postalCode) {
        this.postalAddress = postalAddress;
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
