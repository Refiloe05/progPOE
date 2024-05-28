/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe;

import javax.swing.JOptionPane;

/**
 *
 * @author refil
 */
public class ProgPOE {

    public static void main(String[] args) {
        
         // Declarations //
       
        String firstName =JOptionPane.showInputDialog(null, "Please Enter your First Name: ", "First Name", JOptionPane.QUESTION_MESSAGE);
        String lastName = JOptionPane.showInputDialog(null, "Please Enter your Last Name: ", "Last Name", JOptionPane.QUESTION_MESSAGE);
        String userName = JOptionPane.showInputDialog(null, "Please Enter your Username (It should contain an underscore and should be no more than 5 characters long.): ", "Username", JOptionPane.QUESTION_MESSAGE);
        String passWord = JOptionPane.showInputDialog(null, "Please Enter your Password (It should be at least 8 characters long and contains a capital letter, a number and a special character.): ", "Password", JOptionPane.QUESTION_MESSAGE);
        String validUsername = userName;
        String validPassword = passWord;
       
        
        
        // Create an instance of the Constructors Class
         Login complexity = new Login(userName, passWord);
         
         if (userName.contains("_") &&
             userName.length() <=5){
         JOptionPane.showMessageDialog(null, "Username successfully captured.", "Success", JOptionPane.INFORMATION_MESSAGE);
         } else { 
         JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that username contains an underscore and has no more than 5 characters in length.", "Error", JOptionPane.INFORMATION_MESSAGE);
         
         }
    
         if (passWord.matches(".*[A-Z].*") && 
            passWord.matches(".*[a-z].*") && 
            passWord.matches(".*[1-9].*") && 
            passWord.matches(".*[!@#$%^&*].*") && 
            passWord.length() >=8){
         JOptionPane.showMessageDialog(null, "Password successfully captured.","Success", JOptionPane.INFORMATION_MESSAGE);
         } else {
         JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains 8 characters,a capital letter, a number and a special character.","Error", JOptionPane.INFORMATION_MESSAGE);
         
         }
         
         // If Login Successful
         boolean LoginSuccessful = true;
         
         if (userName.contains("_") &&
            userName.length() <=5 &&
            passWord.matches(".*[A-Z].*") && 
            passWord.matches(".*[a-z].*") && 
            passWord.matches(".*[1-9].*") && 
            passWord.matches(".*[!@#$%^&*].*") && 
            passWord.length() >=8){
             JOptionPane.showMessageDialog(null, "A successful login.", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
         } else {
             JOptionPane.showMessageDialog(null, "A failed login.", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
             
         }
         
          // Register User
         Login registration = new Login(validUsername, validPassword);
         
          if (userName.contains("_") &&
            userName.length() <=5 &&
            passWord.matches(".*[A-Z].*") && 
            passWord.matches(".*[a-z].*") && 
            passWord.matches(".*[1-9].*") && 
            passWord.matches(".*[!@#$%^&*].*") && 
            passWord.length() >=8){
          
         JOptionPane.showMessageDialog (null, "Welcome user, " + firstName + " " + lastName +  " " +  "it is great to see you again. " + JOptionPane.INFORMATION_MESSAGE);
         
          } else { 
          
         JOptionPane.showMessageDialog(null,"Username or password incorrect, please try again." + JOptionPane.INFORMATION_MESSAGE); 
         
        }


          // Part 2 - Add Task Features
          
          

         JOptionPane.showInternalMessageDialog(null, "Welcome to EasyKanban" + JOptionPane.INFORMATION_MESSAGE);
         
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of tasks: "));
        
       Tasks[]tasks = new Tasks[numTasks];
       
       for (int i=0; i<numTasks;i++){
           
           Tasks task = new Tasks();
           
           task.taskName = JOptionPane.showInputDialog(null, "Please enter the task name: ", JOptionPane.QUESTION_MESSAGE);
           task.taskNumber = i;
           task.taskDescription = JOptionPane.showInputDialog(null, "Please enter the task description: ", JOptionPane.QUESTION_MESSAGE);
           task.developerDetails = JOptionPane.showInputDialog(null, "Please enter the developer details: ", JOptionPane.QUESTION_MESSAGE);
           task.taskHours = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the task hours: ", JOptionPane.QUESTION_MESSAGE));
           task.taskID = task.createTaskID();
           task.taskStatus = JOptionPane.showInputDialog(null, "Please enter the task status (To Do/Done/Doing): ", JOptionPane.QUESTION_MESSAGE);
           
           while (!task.checkTaskDescription()){
               
               JOptionPane.showMessageDialog(null, "Please eneter a task description of less than 50 characters");
               task.taskDescription = JOptionPane.showInputDialog("Enter the task description: ");
           }
               JOptionPane.showMessageDialog(null, "Task successfully captured\n\n" + task.printTaskDetails());
               tasks[i] = task;
       
              int options = JOptionPane.showConfirmDialog(null, "Do you want to add another task?", "Continue?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
              if (options == JOptionPane.NO_OPTION){
              break;
              
              }
       }

            int totalHours = Tasks.returnTotalHours(tasks);
            JOptionPane.showMessageDialog(null, "Total combined hours of all entered tasks: " + totalHours);
            
          }
      }  
        
    
            

