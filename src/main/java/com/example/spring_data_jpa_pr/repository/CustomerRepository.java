package com.example.spring_data_jpa_pr.repository;

import com.example.spring_data_jpa_pr.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByName(String name);
}
