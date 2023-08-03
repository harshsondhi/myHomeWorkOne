package com.sondhi.harsh.CustomerPoinCalculator.services;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.Customer;
import com.sondhi.harsh.CustomerPoinCalculator.mudels.CustomerResponse;
import com.sondhi.harsh.CustomerPoinCalculator.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CustomerResposeService {
    private final CustomerRepository customerRepository;
    private final CustomerMapperService customerMapperService;

    public CustomerResposeService(CustomerRepository customerRepository, CustomerMapperService customerMapperService) {
        this.customerRepository = customerRepository;
        this.customerMapperService = customerMapperService;
    }

    public List<CustomerResponse> getAllCustomer() {
        return customerMapperService.customerListToResponseList(customerRepository.findAll());
    }

    public CustomerResponse byCustomerId(Long id) {
        Customer customer = customerRepository.findCustomerByUserId(id);
        CustomerResponse cr = customerMapperService.customerToResponse(customer);
        return cr;
    }
}
