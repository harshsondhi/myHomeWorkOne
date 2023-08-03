package com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.CustomerResponse;

import java.util.List;

public interface CustomerResposeService {

    public List<CustomerResponse> getAllCustomer();

    public CustomerResponse byCustomerId(Long id);
}
