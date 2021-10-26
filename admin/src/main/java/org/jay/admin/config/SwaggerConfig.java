package org.jay.admin.config;

import org.jay.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig extends org.jay.common.config.SwaggerConfig {
    @Override
    public SwaggerProperties getSwaggerProperties() {
        SwaggerProperties swaggerProperties = new SwaggerProperties();
        swaggerProperties.setBasePackage("org.jay.admin.controller");
        swaggerProperties.setTitle("后台管理的swagger");
        swaggerProperties.setDescription("这是继承的swagger配置，为了后台管理使用，用于用户等管理");
        swaggerProperties.setVersion("1.0");
        return swaggerProperties;
    }
}
