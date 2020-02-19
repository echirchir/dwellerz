package co.ke.echirchir.dwellerz.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import co.ke.echirchir.dwellerz.models.Apartment;
import co.ke.echirchir.dwellerz.models.Location;
import co.ke.echirchir.dwellerz.models.Tenant;

@Configuration
public class RepositoryRestConfigurerAdapter implements RepositoryRestConfigurer  {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Apartment.class, Tenant.class, Location.class);
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
	}
}