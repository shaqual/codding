package com.shaqual.website.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class MyBatisConfig {

//    @Autowired
//    DruidDataSource dataSource;

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DruidDataSource dataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] mapperXmlResource = resolver.getResources("classpath:db/mappers/*Mapper.xml");

        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(mapperXmlResource);
        sqlSessionFactory.setTypeAliasesPackage("com.shaqual.website.entity");
        return sqlSessionFactory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.shaqual.website.dao");
        msc.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return msc;
    }

}  