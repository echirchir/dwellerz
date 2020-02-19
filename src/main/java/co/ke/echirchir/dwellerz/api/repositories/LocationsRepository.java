package co.ke.echirchir.dwellerz.api.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.ke.echirchir.dwellerz.models.Location;;

@RepositoryRestResource(path = "locations", collectionResourceRel = "locations")
public interface LocationsRepository extends PagingAndSortingRepository<Location, Long>{


}