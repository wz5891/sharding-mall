package com.example.shardingmall.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_region")
public class Region {
    @TableId
    private Long id;
    private String code;
    private String name;
    private String pCode;
}
