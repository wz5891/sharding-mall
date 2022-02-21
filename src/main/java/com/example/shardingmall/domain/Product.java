package com.example.shardingmall.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_product")
public class Product {
    @TableId
    private Long id;
    private Long shopId;
    private String name;
    private String size;
    private String regionCode;
    private Integer price;
    private String pic;

    @TableField(exist = false)
    private String description;
}
