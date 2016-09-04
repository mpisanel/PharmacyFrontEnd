package com.parmacya.model;

/**
 * Created by SONY on 2016-08-23.
 */
public class Contact {
    private String cellNumber;
    private String homeNumber;

    public Contact() {
    }

    public Contact(String cellNumber, String homeNumber) {
        this.cellNumber = cellNumber;
        this.homeNumber = homeNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
}
