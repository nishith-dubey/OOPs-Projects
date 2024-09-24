package com.carhub.models;

import java.util.Scanner;

public class LoginAndReg {

    void choiceSelection(){
        Scanner scan = new Scanner(System.in);
        User u1 = new User();
        int option = scan.nextInt();
        Scanner sc = new Scanner(System.in);

        switch (option) {

            case 1 :
//                System.out.println("\nWelcome to the Login Page\n");
//                System.out.println("Enter your username: ");
//                String newUsername = sc.nextLine();
//                u1.checkUserName(newUsername);
//                System.out.print("Enter your password: ");
//                String newPassword = sc.nextLine();
//                u1.checkPassword(newPassword);
//                System.out.println("Registration successful!");
//                break;
//
            case 2:
                System.out.println("---------- Welcome to the Registration Page ----------\n");
                System.out.print("Enter your username: ");
                String newUsername = sc.nextLine();
                u1.setUserName(newUsername);
                System.out.print("Create your password: ");
                String newPassword = sc.nextLine();
                u1.setPassword(newPassword);
                System.out.println("Registration successful!");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\n=============== Welcome to CarHub ===============\n\n");
        System.out.println("Select your choice :\n1.Login (Existing User)\n2.Registration (New User)\n");
        LoginAndReg selection  = new LoginAndReg();
        selection.choiceSelection();
    }
}
