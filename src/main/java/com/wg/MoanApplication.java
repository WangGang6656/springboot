package com.wg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.wg.dao")
public class MoanApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoanApplication.class, args);
    }
}
