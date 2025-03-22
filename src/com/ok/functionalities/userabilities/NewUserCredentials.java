package com.ok.functionalities.userabilities;

import com.ok.functionalities.filehandling.NewUserFileCreation;
import java.util.*;

public class NewUserCredentials {


    public static void RegisterUser(){

        String username ;
        String password ;
        int first_depo;

        try{
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter your username: ");
            username = scan.nextLine();

            if (username.contains(" ")) {
                System.out.println("\033[31mError: Username should not contain spaces!\033[0m");
                RegisterUser();
                return;
            }

            System.out.print("Enter Your Password: ");
            password = scan.next();

            System.out.print("First Amount you want to deposit: ");
            while (!scan.hasNextInt()) {
                System.out.println("\033[31mError: Please enter a valid number!\033[0m");
                scan.next();
            }
            first_depo = scan.nextInt();

            if(first_depo<0){
                System.out.println("\033[31mFirst Deposit cannot be negative\033[0m");
                NewUserCredentials.RegisterUser();
            } else if(first_depo<1000){
                System.out.println("\033[31mFirst Deposit cannot be less than 1000\033[0m");
                NewUserCredentials.RegisterUser();
            } else {
                NewUserFileCreation myFile = new NewUserFileCreation();
                myFile.CreateUser(username , password , first_depo);
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("\033[31mError occurred: \033[0m" + e);
            NewUserCredentials.RegisterUser();
        }
    }
}
