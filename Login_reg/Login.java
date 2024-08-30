package OnlineShoppingCart.Login_reg;

import OnlineShoppingCart.Customers.Customers;

import java.util.Scanner;

public class Login {
    public void display(){
        System.out.println("\n\n=============== Welcome to My Online Shopping Cart ===============\n\n");
        System.out.println("Select your choice :\n1.Login (Existing User)\n2.Registration (New User)\n");
    }
    public void takeInput(){
        Customers c1 = new Customers();
        Customers c2 = new Customers();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
//            case 1:
//                System.out.println("---------- Welcome to the Login Page ----------\n");
//                System.out.print("Enter your username: ");
//                String exCustomer = sc.nextLine();
//                c2.checkCName(exCustomer);
//                System.out.print("Create your password: ");
//                String exPassword = sc.nextLine();
//                c2.checkPassword(exPassword);
//                System.out.println("Logged In successfully!");
//                break;
            case 2:
                System.out.println("---------- Welcome to the Registration Page ----------\n");
                System.out.print("Enter your username: ");
                String newCustomer = sc.nextLine();
                c1.setCname(newCustomer);
                System.out.print("Create your password: ");
                String newPassword = sc.nextLine();
                c1.setPassword(newPassword);
                System.out.println("Registration successful!");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
