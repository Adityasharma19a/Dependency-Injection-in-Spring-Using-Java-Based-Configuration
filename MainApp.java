package com.example.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Initialize Spring context using the configuration class
        ApplicationContext context = 
                new AnnotationConfigApplicationContext(SpringConfig.class);

        // Retrieve the student bean
        Student student = context.getBean(Student.class);

        // Call a method to demonstrate dependency injection
        student.displayInfo();
    }
}
