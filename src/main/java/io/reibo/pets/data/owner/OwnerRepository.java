package io.reibo.pets.data.owner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "owner", path = "owner")
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    @RestResource(path = "search-firstname", rel = "search-firstname")
    Iterable<Owner> findByFirstNameIgnoreCase(@Param("firstName") String firstName);
}
