package io.reibo.pets.data.dog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "dog", path = "dog")
public interface DogRepository extends PetRepository<Dog> {
    @RestResource(path = "search-paws", rel = "search-paws")
    //TODO implement named query

    @RestResource(path = "count-breed", rel = "count-breed")
    //TODO implement named query
}
