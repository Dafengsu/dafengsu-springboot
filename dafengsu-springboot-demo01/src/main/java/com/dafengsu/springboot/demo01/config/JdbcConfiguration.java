package com.dafengsu.springboot.demo01.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author su
 * @description
 * @date 2020/4/4
 */
@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

   /* @Autowired
    private JdbcProperties jdbcProperties;*/

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(/*JdbcProperties jdbcProperties*/) {
        DruidDataSource dataSource = new DruidDataSource();
/*        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());*/
        return dataSource;
    }
}
