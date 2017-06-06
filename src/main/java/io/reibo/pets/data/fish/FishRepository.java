package io.reibo.pets.data.fish;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "fish", path = "fish")
public interface FishRepository extends CrudRepository<Fish, Long>{
}
