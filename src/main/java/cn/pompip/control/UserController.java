package cn.pompip.control;

import cn.pompip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService service;
    @Autowired
            @Resource(name = "usersMap")
    Map map;

    public void getUser(){
        System.out.println("getUser");
        System.out.println(map);
        System.out.println(service.findUser());;
    }
}
