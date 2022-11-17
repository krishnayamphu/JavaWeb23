package com.ky.utils;

import java.io.File;
import java.util.ArrayList;

public class MediaFile {
    public static ArrayList<String> getFiles(String path){
        ArrayList<String> files =new ArrayList<>();
        File file=new File(path);
        File[] allFiles=file.listFiles();
        for(File f:allFiles){
            files.add(f.getName());
        }
        return files;
    }

    public static boolean delete(String path,String filename){
        String fileItem=path+"/"+filename;
        File file=new File(fileItem);
        if(file.delete()){
            return true;
        }
        return false;
    }
}
