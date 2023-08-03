package com.sondhi.harsh.CustomerPoinCalculator.servicesImpl;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.Customer;
import com.sondhi.harsh.CustomerPoinCalculator.mudels.CustomerResponse;
import com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces.CustomerMapperService;
import com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces.PointCalculationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

@Service
public class CustomerMapperServiceImpl implements CustomerMapperService {

    private final PointCalculationService pointCalculationService;

    public CustomerMapperServiceImpl(PointCalculationService pointCalculationService) {
        this.pointCalculationService = pointCalculationService;
    }

    @Override
    public CustomerResponse customerToResponse(Customer customer) {
        ModelMapper modelMapper = new ModelMapper();
        CustomerResponse customerResponse = modelMapper.map(customer, CustomerResponse.class);
        customerResponse.setPoint(pointCalculationService.calculatePoints(customer.getAmount()));
        return customerResponse;
    }

    @Override
    public List<CustomerResponse> customerListToResponseList(List<Customer> customers) {
        return customers.stream().map(cust -> customerToResponse(cust)).collect(Collectors.toList());
    }
}
