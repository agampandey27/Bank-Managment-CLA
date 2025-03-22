package com.ok.functionalities.filehandling;

import java.io.*;

public class NewUserFileCreation {
    public static void CreateUser(String username , String password , int amount){
        File myFile = new File("./src/userdata/"+username+".json");
        try{
            if(myFile.createNewFile()){
                System.out.println(username+" account has been created successfully.");
                InputUserData.saveUserData(username, password , amount);
            } else{
                System.out.println("\033[31mUser with username \033[0m'"+username+"'\033[31m already exists\033[0m");
            }
        } catch (IOException e) {
            System.out.println("Error occurred while creating account of "+username+" "+e);
        }
    }
}
