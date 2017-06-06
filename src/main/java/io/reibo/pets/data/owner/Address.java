package io.reibo.pets.data.owner;

import javax.persistence.Column;

/**
 * Created by bovandersteene on 06/06/2017.
 */
public class Address {
    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
