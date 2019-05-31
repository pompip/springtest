package cn.pompip.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDAO {
    @Autowired
    Connection connection;
    public void find() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from article_entity");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String string = resultSet.getString(4);
            System.out.println(string);
        }
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void find2(){
        jdbcTemplate.query("select * from article_entity", new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {

            }
        });
    }
}
