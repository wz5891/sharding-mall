package com.example.shardingmall.dao;

import com.example.shardingmall.domain.Product;
import com.example.shardingmall.domain.ProductDesc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductDao {
    @Insert("INSERT INTO t_product (shop_id, name, size, region_code, price, pic)VALUES" +
            "(#{shopId},#{name},#{size},#{regionCode},#{price},#{pic})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insertProduct(Product product);

    @Insert("INSERT INTO t_product_desc(shop_id, product_id, product_desc)VALUES (#{shopId}, #{productId}, #{productDesc})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insertProductDesc(ProductDesc productDesc);
}
