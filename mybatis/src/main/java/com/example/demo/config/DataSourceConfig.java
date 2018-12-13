package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {

    @Bean("primary")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDB() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }


    @Bean(name = "second")
    @ConfigurationProperties(prefix = "spring.datasource.second")
    public DataSource secondDB() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name="dynamicDB")
    @Primary
    public DataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setDefaultTargetDataSource(primaryDB());

        Map<Object, Object> map = new HashMap<>();
        map.put("primary", primaryDB());
        map.put("second", secondDB());

        dynamicDataSource.setTargetDataSources(map);

        return dynamicDataSource;
    }
}
