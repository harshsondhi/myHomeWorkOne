package com.sondhi.harsh.CustomerPoinCalculator.services;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.Customer;
import com.sondhi.harsh.CustomerPoinCalculator.mudels.CustomerResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

@Service
public class CustomerMapperService {

    private final PointCalculationService pointCalculationService;

    public CustomerMapperService(PointCalculationService pointCalculationService) {
        this.pointCalculationService = pointCalculationService;
    }

    CustomerResponse customerToResponse(Customer customer) {
        ModelMapper modelMapper = new ModelMapper();
        CustomerResponse customerResponse = modelMapper.map(customer, CustomerResponse.class);
        customerResponse.setPoint(pointCalculationService.calculatePoints(customer.getAmount()));
        return customerResponse;
    }

    List<CustomerResponse> customerListToResponseList(List<Customer> customers) {
        return customers.stream().map(cust -> customerToResponse(cust)).collect(Collectors.toList());
    }
}
