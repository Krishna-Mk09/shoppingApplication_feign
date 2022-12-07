package com.niit.springAPIGateWayService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpringApiGateWayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiGateWayServiceApplication.class, args);
	}
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/api/v1/**")
						.uri("http://UserAuthenticate:8080/")) // use the name of the application in the uri

				.route(p->p
						.path("/api/v2/**")
						.uri("http://customer-service:8086/"))
				.build();
	}

}
