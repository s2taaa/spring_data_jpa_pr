package com.example.spring_data_jpa_pr.repository;

import com.example.spring_data_jpa_pr.entity.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    @Query("select c from Customer c")
    List<Customer> getAll();

    @Query("select c from Customer c where p.name = 'long'")
    List<Customer> getListByName(String name);

    @Transactional
    @Modifying
    @Query(value = "insert into Customer() values(22,'longdepzai','s2kaa@gmail')", nativeQuery = true)
    void addCustomer(Customer customer);

    @Transactional
    @Modifying
    @Query(value = "update Customer p set p.name = 'longca' where p.id = ?1")
    void updateCustomer(Integer id, String name);

    @Transactional
    @Modifying
    @Query("delete from Customer p where p.id = ?1")
    void deleteCustomerById(Integer id);
}
