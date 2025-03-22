package com.ok.functionalities.filehandling;

import java.io.*;

public class InputUserData {
    public static void saveUserData(String username , String password , int amount){
        String jsonContent = "{\n"
                + "  \"username\": \"" + username + "\",\n"
                + "  \"password\": \"" + password + "\",\n"
                + "  \"amount\": " + amount + "\n"
                + "}";

        try{
            FileWriter myFile = new FileWriter("./src/userdata/"+username+".json");
            myFile.write(jsonContent);
            myFile.flush();
            System.out.println("User Data Saved :)");
        } catch (Exception e) {
            System.out.println("Error in input : " + e);
        }
    };
}
