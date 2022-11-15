package com.ky.dao;

import com.ky.database.ConnectDB;
import com.ky.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {

    private static ArrayList<User> users;

    public static User getUser(int id) {
        User user = new User();
        try {
            Connection con = ConnectDB.connect();
            String sql = "SELECT * FROM users WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return user;
    }

    public static ArrayList<User> getUsers() {
        try {
            users = new ArrayList();
            Connection con = ConnectDB.connect();
            String sql = "SELECT * FROM users";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                users.add(user);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return users;
    }

    public static void addUser(User user) {
        String sql = "INSERT INTO users VALUES(null,?,?,?)";
        try {
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(User user) {
        String sql = "UPDATE users SET username=?,password=?,email=? WHERE id=?";
        try {
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setInt(4,user.getId());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id=?";
        try {
            Connection con = ConnectDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
