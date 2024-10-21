package com.livemilton.redis_performance.repository;

import com.livemilton.redis_performance.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
}
