create database product_db_2 character set utf8mb4 COLLATE utf8mb4_unicode_ci;
use product_db_2;

CREATE TABLE t_region
(
    id     BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    code   VARCHAR(255) COMMENT '编码',
    name   VARCHAR(255) COMMENT '名称',
    p_code VARCHAR(255) COMMENT '上级编码',
    PRIMARY KEY (id)
) COMMENT = '区域';

CREATE TABLE t_product_1
(
    id          BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    shop_id     BIGINT COMMENT '所属店铺',
    name        VARCHAR(255) COMMENT '产品名称',
    size        VARCHAR(255) COMMENT '规格',
    region_code VARCHAR(255) COMMENT '产地',
    price       INT COMMENT '价格',
    pic         VARCHAR(255) COMMENT '图片',
    PRIMARY KEY (id)
) COMMENT = '商品';

CREATE TABLE t_product_desc_1
(
    id         BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    shop_id BIGINT   COMMENT '所属店铺' ,
    product_id BIGINT COMMENT '产品id',
    product_desc       VARCHAR(255) COMMENT '描述',
    PRIMARY KEY (id)
) COMMENT = '商品描述';


CREATE TABLE t_product_2
(
    id          BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    shop_id     BIGINT COMMENT '所属店铺',
    name        VARCHAR(255) COMMENT '产品名称',
    size        VARCHAR(255) COMMENT '规格',
    region_code VARCHAR(255) COMMENT '产地',
    price       INT COMMENT '价格',
    pic         VARCHAR(255) COMMENT '图片',
    PRIMARY KEY (id)
) COMMENT = '商品';
CREATE TABLE t_product_desc_2
(
    id         BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    shop_id BIGINT   COMMENT '所属店铺' ,
    product_id BIGINT COMMENT '产品id',
    product_desc       VARCHAR(255) COMMENT '描述',
    PRIMARY KEY (id)
) COMMENT = '商品描述';
