package com.sondhi.harsh.CustomerPoinCalculator.controllers;

import com.sondhi.harsh.CustomerPoinCalculator.mudels.CustomerResponse;
import com.sondhi.harsh.CustomerPoinCalculator.servicesinterfaces.CustomerResposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerResposeService customerResposeService;

    @GetMapping("/all")
    Iterable<CustomerResponse> getAllCustomer() {

        return customerResposeService.getAllCustomer();
    }

    @GetMapping("customer/{id}")
    CustomerResponse byCustomerId(
            @RequestParam("id") Long id) {

        return customerResposeService.byCustomerId(id);
    }


}
