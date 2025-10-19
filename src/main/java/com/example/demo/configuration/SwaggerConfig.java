package com.example.demo.configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Demo API Documentation 2")
                        .version("1.0.0")
                        .description("API documentation for the Demo project 2")
                        .contact(new Contact()
                                .name("Cuong Nguyen 2 ---hehehhe")
                                .email("cuong@example.com")
                                .url("https://example.com")));
    }
}
