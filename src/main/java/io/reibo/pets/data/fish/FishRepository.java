package io.reibo.pets.data.fish;

import io.reibo.pets.data.common.PetRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by bovandersteene on 06/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "fish", path = "fish")
public interface FishRepository extends PetRepository<Fish> {
    Iterable<Fish> findByFinsGreaterThanEqual(@Param("fins") Integer fins);

    @RestResource(path = "search-no-fins", rel="search-no-fins")
    @Query("SELECT f FROM Fish f WHERE f.fins = 0")
    Iterable<Fish> findNoFins();
}
