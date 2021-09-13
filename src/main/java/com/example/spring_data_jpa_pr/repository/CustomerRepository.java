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

    @Query(value = "select * from tbl_customer", nativeQuery = true)
    List<Customer> getAll();

    @Query(value = "select * from tbl_customer where name = 'long'", nativeQuery = true)
    List<Customer> getListByName(String name);

    @Transactional
    @Modifying
    @Query(value = "insert into tbl_customer values(1,21,'longk','s2kaaa')", nativeQuery = true)
    void addCustomer(String name);

    @Transactional
    @Modifying
    @Query(value = "update tbl_customer set name = ?'longcute' where id = ?2", nativeQuery = true)
    void updateCustomer(Integer id, String name);

    @Transactional
    @Modifying
    @Query(value = "delete from person where id = ?1", nativeQuery = true)
    void deleteCustomerById(Integer id);
}
