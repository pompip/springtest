package cn.pompip;

import cn.pompip.config.AppConfig;
import cn.pompip.control.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Main {

    @Autowired
    UserController controller;


    public static void main(String[] arsgs){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.scan("cn.pompip");
//        UserController controller = context.getBean(UserController.class);
        Main main =context.getBean(Main.class);
        Map map = (Map) context.getBean("usersMap");
        map.put("hello","world");
        main.controller.getUser();
    }
}
