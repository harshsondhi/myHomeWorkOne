package com.sondhi.harsh.CustomerPoinCalculator.mudels;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CustomerResponse {
    private Long userId;
    private String description;
    private Double amount;
    private LocalDateTime transactionDateTime;
    private int point;
}
