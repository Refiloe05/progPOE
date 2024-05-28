/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoe;

/**
 *
 * @author refil
 */
public class Tasks {
    
    String taskName;
     int taskNumber;
     String taskDescription;
     String developerDetails;
     int taskHours;
     String taskID;
     String taskStatus;

    public boolean checkTaskDescription(){
        return taskDescription.length()<=50;
    }
    
    public String createTaskID(){
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return "taskID";
     }   
    
    public String printTaskDetails(){
     return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID + "\nTask Duration: " + taskHours + "Hours";
    
    }
    
    public static int returnTotalHours(Tasks[]tasks){
    int totalHours = 0;
    for(Tasks task : tasks){
        totalHours += task.taskHours;
    }
    return totalHours;
    }
}

    

