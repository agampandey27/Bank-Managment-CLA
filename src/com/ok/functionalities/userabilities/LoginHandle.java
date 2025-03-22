package com.ok.functionalities.userabilities;

import com.ok.functionalities.filehandling.SearchFile;

import java.util.*;

public class LoginHandle {

    public static void getInfo(){

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your username : ");
            String username = scan.nextLine();

            if (username.contains(" ")) {
                System.out.println("\033[31mError: Username should not contain spaces!\033[0m");
                getInfo();
                return;
            }

            if(SearchFile.search(username)){
                System.out.println("User Found");
            }else{
                System.out.println("\033[31mNo user with username "+username+" found in the records\033[0m");
                return;
            }

            scan.close();
        } catch (Exception e) {
            System.out.println("\033[31mError Occurred Logging in: \033[0m" + e);
        }
    }
}
