package com.example.shardingmall.service;

import com.example.shardingmall.domain.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceTest {
    @Resource
    private ProductService productService;

    @Test
    void createProduct() {
        for(int i=0;i<10;i++){
            Product product = new Product();
            product.setName("冰墩墩");
            product.setDescription("2022年冬奥会吉详物");
            product.setSize("大号");
            product.setRegionCode("100001");
            product.setShopId(1L);
            product.setPrice(5000);
            product.setPic("");

            productService.createProduct(product);
        }
    }
}