package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Ranj = new Student( "Ranjith", "Tadisina","Ranjitha@va.gov", LocalDate.of(1975, Month.MAY, 19) );

            Student Pra = new Student( "Pranay","Munjampally", "Pranay@va.gov", LocalDate.of(1974, Month.JUNE, 25) );

            Student Vin = new Student( "Vinay", "Bingi","Vinay@va.gov", LocalDate.of(1975, Month.JULY, 10) );

            Student Mar = new Student( "Marcos","Serrano", "Marcos@va.gov", LocalDate.of(1974, Month.AUGUST, 12) );

            repository.saveAll(List.of(Ranj, Pra, Vin, Mar));
        };
    }


}
