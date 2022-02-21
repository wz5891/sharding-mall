package com.example.shardingmall.service.impl;

import com.example.shardingmall.dao.ProductDao;
import com.example.shardingmall.domain.Product;
import com.example.shardingmall.domain.ProductDesc;
import com.example.shardingmall.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    @Override
    @Transactional //如果分库分表到多个库，这个事务还有用吗
    public void createProduct(Product product) {
        productDao.insertProduct(product);

        ProductDesc desc = new ProductDesc();
        desc.setProductId(product.getId());
        desc.setProductDesc(product.getDescription());
        desc.setShopId(product.getShopId());
        productDao.insertProductDesc(desc);
    }
}
