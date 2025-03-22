package com.ok.functionalities.filehandling;

import java.io.*;

public class SearchFile {
    public static boolean search(String username){
        File myFile = new File("./src/userdata/"+username+".json");
        return myFile.exists() && myFile.isFile();
    }
}
