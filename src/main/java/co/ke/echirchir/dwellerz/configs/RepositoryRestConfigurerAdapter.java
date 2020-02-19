package co.ke.echirchir.dwellerz.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryRestConfigurerAdapter implements RepositoryRestConfigurer  {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		//config.exposeIdsFor();
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
	}
}