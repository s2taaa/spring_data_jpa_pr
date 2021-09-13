package com.example.spring_data_jpa_pr;

import com.example.spring_data_jpa_pr.entity.Customer;
import com.example.spring_data_jpa_pr.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringDataJpaPrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaPrApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CustomerRepository customerRepository){
        return args -> {
            insertEmployee(customerRepository);
        };
    }
    private void insertEmployee(CustomerRepository customerRepository){
        Customer customer = Customer.builder()
                .name("long")
                .email("s2taaa@gmail.com")
                .age(21)
                .build();
        customerRepository.save(customer);

    }

}