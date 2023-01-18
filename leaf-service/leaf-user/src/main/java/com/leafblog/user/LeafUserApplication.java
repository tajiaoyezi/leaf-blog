package com.leafblog.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author leaflei
 * @date 2022年12月21日 17:16:55
 */
@SpringBootApplication
@MapperScan("com.leafblog.user.mapper")
public class LeafUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeafUserApplication.class, args);
	}

}
