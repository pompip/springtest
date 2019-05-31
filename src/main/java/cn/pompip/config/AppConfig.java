package cn.pompip.config;

import cn.pompip.control.UserController;
import cn.pompip.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "cn.pompip")
public class AppConfig {
    @Bean(name= "usersMap")
    public Map getMap(){
        return new HashMap();
    }

//    @Bean
//    public UserService getUserService(){
//        return  new UserService();
//    }
}
