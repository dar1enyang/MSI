package com.mercury.daos;

import com.mercury.beans.User;
import com.mercury.utils.JdbcUtil;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: jdbcDemoJ
 * @description: CRUD operations for User
 * @author: yangdar1en
 * @create: 2019-08-14 14:23
 **/

public class UserDao {
    public void save(User user) {
        String sql = "{?=call SAVEUSER(?, ?)}";

        try(Connection connection = JdbcUtil.getConnection();
            CallableStatement cs = connection.prepareCall(sql);
        ) {
            cs.setString(2, user.getName());
            cs.setInt(3, user.getAge());

            cs.registerOutParameter(1, Types.INTEGER);

            cs.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<User> getAll() {
        List<User> list = new ArrayList<User>();

        String sql = "select * from SAMPLE";
        try (Connection connection = JdbcUtil.getConnection();
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql);
        ) {
            while (rs.next()) {
                list.add(new User(rs.getString("name"), rs.getInt("age")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  list;
    }

    public User getByName(String name) {
        User u = null;

        // ? placeholder
        String sql = "select * from SAMPLE where name = ?";
        try (Connection connection = JdbcUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                u = new User(name, rs.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return u;
    }

    public void deleteByName(String name) {

    }


}
