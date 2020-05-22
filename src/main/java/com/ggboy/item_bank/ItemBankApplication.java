package com.ggboy.item_bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.ggboy.item_bank.dao")
@SpringBootApplication
public class ItemBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemBankApplication.class, args);
    }

}
