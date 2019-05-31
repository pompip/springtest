package cn.pompip;

import cn.pompip.control.UserController;
import cn.pompip.dao.DAOConnection;
import org.junit.Test;

public class TestConnect {
    @Test
    public void test1(){
        new DAOConnection().connect();
    }
}
