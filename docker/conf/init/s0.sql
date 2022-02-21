create database store_db character set utf8mb4 COLLATE utf8mb4_unicode_ci;
use store_db;

CREATE TABLE t_region
(
    id     BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    code   VARCHAR(255) COMMENT '编码',
    name   VARCHAR(255) COMMENT '名称',
    p_code VARCHAR(255) COMMENT '上级编码',
    PRIMARY KEY (id)
) COMMENT = '区域';

CREATE TABLE t_shop
(
    id   BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    name VARCHAR(255) COMMENT '名称',
    PRIMARY KEY (id)
) COMMENT = '店铺';




