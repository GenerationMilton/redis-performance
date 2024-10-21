package com.livemilton.redis_performance.entity;


import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@ToString
public class Product {

    @Id
    private Integer id;
    private String description;
    private double price;
}
