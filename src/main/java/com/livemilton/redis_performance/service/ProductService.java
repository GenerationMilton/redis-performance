package com.livemilton.redis_performance.service;

import com.livemilton.redis_performance.entity.Product;
import com.livemilton.redis_performance.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //SERVICE GET
    public Mono<Product> getProduct(int id){
        return this.repository.findById(id);
    }
    //SERVICE UPDATE PRODUCT

    public Mono<Product> updateProduct(int id, Mono <Product> productMono){
        return this.repository.findById(id)
                .flatMap(p->productMono.doOnNext(product -> product.setId(id)))
                .flatMap(this.repository::save);
    }
}
