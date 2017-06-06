package io.reibo.pets.data.common;

import java.time.LocalDateTime;

/**
 * Created by bovandersteene on 06/06/2017.
 */
public abstract class Pet {
    private Long id;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private String name;

}
