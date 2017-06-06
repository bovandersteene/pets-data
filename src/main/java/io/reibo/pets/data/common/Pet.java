package io.reibo.pets.data.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.reibo.pets.data.AttributeConverter.LocalDateTimeConverter;
import io.reibo.pets.data.owner.Owner;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@MappedSuperclass
public abstract class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "creation_datetime")
    @JsonIgnore
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime creationDate;

    @Column(name = "lastModifiedDate")
    @JsonIgnore
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime lastModifiedDate;
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private Owner owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pet pet = (Pet) o;

        return id != null ? id.equals(pet.id) : pet.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
