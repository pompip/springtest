package cn.pompip.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DAOConnection {
    @Bean()
    public Connection connect(){
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://java.asuscomm.com:3306/myblog?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
        String username = "chong";
        String password = "314159";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn =  DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Bean(name = "dataSource" )
    public DataSource getDataSource(){
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://java.asuscomm.com:3306/myblog?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
        String username = "chong";
        String password = "314159";
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
}
