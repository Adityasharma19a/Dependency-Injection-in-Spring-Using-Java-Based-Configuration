package com.example.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Course course() {
        return new Course("Spring Framework");
    }

    @Bean
    public Student student() {
        // Injecting the course bean into the student bean
        return new Student(course());
    }
}
