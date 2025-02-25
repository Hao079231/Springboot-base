package com.base.auth.repository;

import com.base.auth.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepository extends JpaRepository<Customer, Long>,
    JpaSpecificationExecutor<Customer> {

}
