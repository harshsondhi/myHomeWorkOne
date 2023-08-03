package com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.Customer;
import com.sondhi.harsh.CustomerPoinCalculator.mudels.CustomerResponse;

import java.util.List;

public interface CustomerMapperService {

    public CustomerResponse customerToResponse(Customer customer);

    public List<CustomerResponse> customerListToResponseList(List<Customer> customers);
}
