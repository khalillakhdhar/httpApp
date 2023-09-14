package com.demonstration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Vous pouvez spécifier ici l'URL spécifique à laquelle vous souhaitez autoriser l'accès.
            .allowedOrigins("http://localhost:4200") // Autoriser l'accès depuis ce domaine Angular.
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Méthodes HTTP autorisées.
            .allowedHeaders("*"); // Tous les en-têtes autorisés.
    }
}
