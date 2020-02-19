package co.ke.echirchir.dwellerz.configs;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig{

    @Bean
	public Docket swaggerConfiguration(){

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.any())
				.build()
				.apiInfo(apiDetails());
				
	}
	
    private ApiInfo apiDetails(){

		return new ApiInfo(
			"Dwellerz Service API", 
			"API for the Dwellerz Web Services", 
			"1.0", 
			"Free to Use", 
			new Contact("Elisha Chirchir", "http://codingcamp.co.ke", "elisha.java@gmail.com"), 
			"MIT Licence", 
			"http://codingcamp.co.ke", 
			Collections.emptyList());
	}
}