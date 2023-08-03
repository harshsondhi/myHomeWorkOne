package com.sondhi.harsh.CustomerPoinCalculator.util;


import com.github.javafaker.Faker;
import com.sondhi.harsh.CustomerPoinCalculator.mudels.Customer;
import com.sondhi.harsh.CustomerPoinCalculator.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

@Component
public class CustomerDatalLoader implements CommandLineRunner {


    private final CustomerRepository customerRepository;
    private final Faker faker;

    public CustomerDatalLoader(CustomerRepository customerRepository, Faker faker) {
        this.customerRepository = customerRepository;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i < 100; i++) {
            Customer customer = new Customer();
            customer.setUserId(faker.number().randomNumber());
            customer.setDescription(faker.lorem().sentence());
            customer.setAmount(faker.number().randomDouble(2, 20, 200));
            customer.setTransactionDateTime(faker.date().past(90, TimeUnit.DAYS).toInstant()
                    .atZone(ZoneId.systemDefault()).toLocalDateTime());
            customerRepository.save(customer);
        }

    }
}
