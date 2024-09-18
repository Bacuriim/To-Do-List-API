package com.einstein.ToDoList.SwaggerConfig;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    Contact contact = new Contact();
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Documentation of a To Do List")
                        .version("1.0")
                        .description("### Made by Conrado Einstein \n\nThis is the API documentation for my project\n\n Request body example: \n\n{\n\n" +
                                "    \"id\": 1,\n\n" +
                                "    \"title\": \"Introdução ao tcc\",\n\n" +
                                "    \"content\": \"Faz o L\",\n\n" +
                                "    \"finished\": true" +
                                "\n\n}\n\n\n\n").contact(contact.email("conradoeinsteinpro@gmail.com").url("https://github.com/Bacuriim")));
    }
}