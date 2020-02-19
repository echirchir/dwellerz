package co.ke.echirchir.dwellerz.api.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.ke.echirchir.dwellerz.models.Tenant;

@RepositoryRestResource(path = "tenants", collectionResourceRel = "tenants")
public interface TenantsRepository extends PagingAndSortingRepository<Tenant, Long>{


}