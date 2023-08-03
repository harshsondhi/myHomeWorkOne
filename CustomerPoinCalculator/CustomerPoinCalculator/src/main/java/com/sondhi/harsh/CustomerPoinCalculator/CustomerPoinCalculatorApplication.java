package com.sondhi.harsh.CustomerPoinCalculator;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;

@SpringBootApplication
public class CustomerPoinCalculatorApplication {
    //Important links for H2 DataBase and swagger UI
    //http://localhost:8081/swagger-ui/index.html
    //http://localhost:8081/h2-console

    public static void main(String[] args) {
        SpringApplication.run(CustomerPoinCalculatorApplication.class, args);
    }


    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(new Info().title("Redis OM Spring Skeleton").version("1.0.0"));
    }

    @Bean
    public GroupedOpenApi httpApi() {
        return GroupedOpenApi.builder()
                .group("http")
                .pathsToMatch("/**")
                .build();
    }

}
