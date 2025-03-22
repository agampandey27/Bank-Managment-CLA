package com.ok.functionalities.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GetUserData {
    public static void seeData(String username){
        try (Scanner scanner = new Scanner(new File("./src/userdata/"+username+".json"))) {
            StringBuilder ans = new StringBuilder();
            while (scanner.hasNextLine()) {
                ans.append(scanner.nextLine());
            }
            System.out.println(ans);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
