package com.sondhi.harsh.CustomerPoinCalculator.servicesImpl;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.Customer;
import com.sondhi.harsh.CustomerPoinCalculator.mudels.CustomerResponse;
import com.sondhi.harsh.CustomerPoinCalculator.repository.CustomerRepository;
import com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces.CustomerMapperService;
import com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces.CustomerResposeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerResposeServiceImpl implements CustomerResposeService {
    private final CustomerRepository customerRepository;
    private final CustomerMapperService customerMapperService;

    public CustomerResposeServiceImpl(CustomerRepository customerRepository, CustomerMapperService customerMapperService) {
        this.customerRepository = customerRepository;
        this.customerMapperService = customerMapperService;
    }

    @Override
    public List<CustomerResponse> getAllCustomer() {
        return customerMapperService.customerListToResponseList(customerRepository.findAll());
    }

    @Override
    public CustomerResponse byCustomerId(Long id) {
        Customer customer = customerRepository.findCustomerByUserId(id);
        CustomerResponse cr = customerMapperService.customerToResponse(customer);
        return cr;
    }
}
