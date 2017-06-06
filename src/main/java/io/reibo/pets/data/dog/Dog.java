package io.reibo.pets.data.dog;

import io.reibo.pets.data.common.Pet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@Entity()
@Table(name = "dog")
public class Dog extends Pet {
    @Column(name = "paws")
    private Integer paws;
    @Column(name="live_outside")
    private Boolean liveOutside;
    @Column(name="breeed")
    public String breed;

    public Integer getPaws() {
        return paws;
    }

    public void setPaws(Integer paws) {
        this.paws = paws;
    }

    public Boolean getLiveOutside() {
        return liveOutside;
    }

    public void setLiveOutside(Boolean liveOutside) {
        this.liveOutside = liveOutside;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
