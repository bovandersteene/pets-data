package io.reibo.pets.data.owner;

import javax.persistence.*;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@Table(name = "address")
@Entity()
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
