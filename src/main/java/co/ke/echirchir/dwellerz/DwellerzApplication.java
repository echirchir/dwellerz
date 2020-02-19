package co.ke.echirchir.dwellerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import co.ke.echirchir.dwellerz.api.repositories.ApartmentsRepository;
import co.ke.echirchir.dwellerz.api.repositories.TenantsRepository;
import springfox.documentation.annotations.ApiIgnore;

@SpringBootApplication
@ApiIgnore
@EnableJpaRepositories(basePackageClasses = {ApartmentsRepository.class, TenantsRepository.class})
public class DwellerzApplication {

	public static void main(String[] args) {
		SpringApplication.run(DwellerzApplication.class, args);
	}
	
}
