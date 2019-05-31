package cn.pompip.service;

import cn.pompip.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;
    public String findUser(){
        try {
            userDAO.find();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "chong";
    }
}
