package io.reibo.pets.data.fish;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "fish", path = "fish")
public interface FishRepository extends PetRepository<Fish> {
    //TODO implement named query

    @RestResource(path = "search-no-fins", rel="search-no-fins")
    //TODO implement custom query
}
