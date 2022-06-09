package com.summer.mysqlmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan
@SpringBootApplication
public class MysqlMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlMyBatisApplication.class, args);
    }

}
