package com.javaacademy.sprinttestapp.repositories;

import com.javaacademy.sprinttestapp.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Customer getById(Integer id);
    public List<Customer> getAllByIdBetween(Integer id, Integer id2);
}