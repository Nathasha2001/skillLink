package com.levelup.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() { //funtion
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) { 
                registry.addMapping("/**")
<<<<<<< HEAD
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("*") 
=======
                        .allowedOrigins("http://localhost:3000")// make local host
                        .allowedMethods("*")
>>>>>>> 83f563e862108a525b8038e808d4386114840e3a
                        .allowedHeaders("*")
                        .allowCredentials(true)
                        .exposedHeaders("Authorization");//set authorizatio
            }
        };
    }
}
