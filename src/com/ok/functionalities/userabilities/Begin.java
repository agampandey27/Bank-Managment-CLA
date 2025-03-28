package com.ok.functionalities.userabilities;

import java.util.*;

public class Begin {

    public static void auth(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an option : ");
        System.out.println("1. Existing User");
        System.out.println("2. Register New User");
        System.out.println("3. EXIT");
        System.out.print("Enter 1, 2 or 3 : ");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                LoginHandle.getInfo();
                break;
            case 2:
                NewUserCredentials.RegisterUser();
                break;
            case 3:
                System.out.println("THANK YOU FOR COMING!!!");
                return;
            default:
                System.out.println("\033[31mInvalid Choice Please Enter a Valid Choice\033[0m");
                System.out.println("");
                Begin.auth();
        }

        scan.close();
    }

}
