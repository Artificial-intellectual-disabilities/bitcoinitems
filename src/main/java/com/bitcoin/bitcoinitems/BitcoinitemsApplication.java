package com.bitcoin.bitcoinitems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bitcoin.bitcoinitems.dao")
public class BitcoinitemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitcoinitemsApplication.class, args);
    }

}
