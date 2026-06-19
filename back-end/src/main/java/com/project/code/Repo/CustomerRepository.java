package com.project.code.Repo;

import java.util.List;
import java.util.Optional;

import com.project.code.Model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public Customer findByEmail(String email);

    // FIX: Return Optional<Customer> to match JpaRepository's signature
    public Optional<Customer> findById(Long id);

    public List<Customer> findByName(String name);

}