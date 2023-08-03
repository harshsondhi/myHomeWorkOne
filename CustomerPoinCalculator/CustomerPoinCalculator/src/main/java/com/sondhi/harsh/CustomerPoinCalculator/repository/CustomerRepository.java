package com.sondhi.harsh.CustomerPoinCalculator.repository;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerByUserId(Long userId);
}
