package co.ke.echirchir.dwellerz.api.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.ke.echirchir.dwellerz.models.Apartment;

@RepositoryRestResource(path = "apartments", collectionResourceRel = "apartments")
public interface ApartmentsRepository extends PagingAndSortingRepository<Apartment, Long>{


}