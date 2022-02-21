package com.example.shardingmall.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_shop")
public class Shop {
    @TableId
    private Long id;
    private String name;
}
