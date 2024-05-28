/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoe;

/**
 *
 * @author refil
 */
public class Login {
    
     // Declarations
    
   private String message;
   private String userName;
   private String passWord;
   private String firstName;
   private String lastName;
   private String validUsername = "";
   private String validPassword = " ";
  
   
   
   public Login (String userName, String passWord){


       
       this.userName = userName;
       this.passWord = passWord;
       
   }

//Prompt user to enter credentials 


        public boolean userNameComplexity() {
            
      return userName.contains("_") &&
             userName.length() <=5;
 
        }


       
    public boolean passwordComplexity() {

   return  (passWord.matches(".*[A-Z].*") && 
            passWord.matches(".*[a-z].*") && 
            passWord.matches(".*[1-9].*") && 
            passWord.matches(".*[!@#$%^&*].*") && 
            passWord.length() >=8);
    }
    
    public boolean LoginUser(){
        
        if (userName.equals(validUsername) && passWord.equals(validPassword)){
        return true;
        } else {
        return false;
        }
        
      
    }
}

