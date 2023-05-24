package fr.entretien.mybatis.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
//Pour une approche xml
//Je fais la conf via application.properties (plus simple avec Spring boot )
public class MyBatisConfig {/*

    @Value("classpath:mybatis/mybatis-config.xml")
    private Resource myBatisConfig;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setConfigLocation(myBatisConfig);
        return sessionFactoryBean.getObject();
    }*/

}