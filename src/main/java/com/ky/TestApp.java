package com.ky;

import com.ky.dao.UserDAO;
import com.ky.models.User;
import com.ky.utils.MediaFile;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
        ArrayList<String> files= MediaFile.getFiles("src/main/webapp/jsp");
        for(String item:files){
            System.out.println(item);
        }
    }
}
