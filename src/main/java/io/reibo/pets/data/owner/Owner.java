package io.reibo.pets.data.owner;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.reibo.pets.data.AttributeConverter.LocalDateTimeConverter;
import io.reibo.pets.data.common.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@Table(name = "owner")
@Entity()
public class Owner implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "creation_datetime")
    @JsonIgnore
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime creationDate;
    @Column(name = "lastModifiedDate")
    @JsonIgnore
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime lastModifiedDate;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Owner owner = (Owner) o;

        return id != null ? id.equals(owner.id) : owner.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
