package com.example.shardingmall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_product_desc")
public class ProductDesc {
    private Long id;
    private Long shopId;
    private Long productId;
    private String productDesc;
}
