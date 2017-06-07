package io.reibo.pets.data.dog;

import io.reibo.pets.data.common.PetRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "dog", path = "dog")
public interface DogRepository extends PetRepository<Dog> {
    @RestResource(path = "search-paws", rel = "search-paws")
    Iterable<Dog> findByPawsGreaterThanEqual(@Param("paws") Integer paws);

    @RestResource(path = "count-breed", rel = "count-breed")
    Integer countByBreed(@Param("breed") String breed);
}
