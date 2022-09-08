package com.example.app.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student saeed = new Student(1L, "saeed", "Helloworld@gmail.com", LocalDate.of(2000, 12, 2));
            Student ali = new Student(2L, "ali", "shitmoos@gmail.com", LocalDate.of(1999, 12, 15));
            repository.saveAll(List.of(saeed, ali));
        };
    }
}
