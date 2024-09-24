package com.carhub.models;

import java.util.Scanner;

public class User {
         String userName;
         String password;

//         User(String userName,String password){
//             this.userName = userName;
//             this.password = password;
//         }
         //getters will store the info about each user
//         public String getUserName(){
//             return this.userName;
//         }
//
//         public String getPassword() {
//            return this.password;
//         }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
