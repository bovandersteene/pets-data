package io.reibo.pets.data.common;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by bovandersteene on 07/06/2017.
 */
@NoRepositoryBean
public interface PetRepository<P extends Pet> extends CrudRepository<P, Long> {
    @RestResource(path = "search-name", rel = "search-name")
    //TODO implement named query
}
