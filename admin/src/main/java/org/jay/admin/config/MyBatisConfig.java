package org.jay.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.jay.admin.mapper")
public class MyBatisConfig {

}
