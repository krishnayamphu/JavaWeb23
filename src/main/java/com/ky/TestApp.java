package com.ky;

import com.ky.dao.UserDAO;
import com.ky.models.User;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
        ArrayList<User> users= UserDAO.getUsers();
        for(User u:users){
            System.out.println(u.getUsername());
        }
    }
}
