package io.reibo.pets.data.fish;

import io.reibo.pets.data.common.Pet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@Entity()
@Table(name = "fish")
public class Fish extends Pet {
    @Column(name = "fins")
    private Integer fins;
    @Column(name="live_in_sea")
    private Boolean liveInSea;

    public Integer getFins() {
        return fins;
    }

    public void setFins(Integer fins) {
        this.fins = fins;
    }

    public Boolean getLiveInSea() {
        return liveInSea;
    }

    public void setLiveInSea(Boolean liveInSea) {
        this.liveInSea = liveInSea;
    }
}
