package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.NOVEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kushagra = new Student(
                    1L,
                    "Kushagra Sharma",
                    "sde.kushagra@gmail.com",
                    LocalDate.of(1999, NOVEMBER, 25)
            );

            Student Nikunj = new Student(
                    2L,
                    "Nikunj Sharma",
                    "nikunjsharma@gmail.com",
                    LocalDate.of(2010, FEBRUARY,21)
            );

            repository.saveAll(
                    java.util.List.of(kushagra, Nikunj)
            );
        };
    }


}
