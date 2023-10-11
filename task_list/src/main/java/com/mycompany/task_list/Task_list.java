package com.mycompany.task_list;

import java.util.Scanner;

public class Task_list {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 1;
        String task;                                                                          
        String[] tasks = {"","","","","","","","","",""};                      
        int counter_list = 0;                                                                  
        
        
        System.out.println("Welcome to your to-do list (you can have no more than 10 to-do's).");
        
        while(num != 0){
            
          boolean empty = false;                                                                
          int empty_task;                                                                               
          int save_counter_list = 0;                                                                            
            
          System.out.println("Press 1 to add a pending task.");
          System.out.println("Press 2 to see pending tasks.");
          System.out.println("Press 3 to delete a task.");
          System.out.println("Press 0 to exit the program.");
          num = sc.nextInt();
          
          while(num < 0 || num > 3){
              System.out.println("Error, re-enter a number");
              num = sc.nextInt();
          }
          
            switch (num) {
                
                case 1:
                    System.out.println("Add the task: ");
                    sc.nextLine();
                    task = sc.nextLine();      
                    
                    for(empty_task = 0; empty_task < 10; empty_task++){                              
                        if(tasks[empty_task] == ""){                                                               
                            empty = true;                                                                   
                            break;
                        }
                    }
                    
                    if(empty){                                                                
                        save_counter_list = counter_list;                                                                       
                        counter_list = empty_task;          
                        tasks[counter_list] = task;  
                        counter_list = save_counter_list;
                    } else {
                        System.out.println("You already have 10 tasks, which task do you want to overwrite?");
                        counter_list = sc.nextInt();
                        tasks[counter_list-1] = task;
                        
                    }

                    System.out.println("Task added.");
                    break;
                    
                case 2:
                    System.out.println("These are your pending tasks: ");
                    for(int i = 0; i < tasks.length; i++){                                                            
                        System.out.println(i + 1 + "- " + tasks[i]);                                           
                    }   break;
                    
                case 3:
                    System.out.println("Type the task number you want to delete (if you do not want to delete any press 0): ");
                    int delete = sc.nextInt();
                    if(delete == 0){
                        break;
                    }
                    tasks[delete-1] = "";                                                                                   
                    System.out.println("Task deleted.");
                    break;
                default:
                    System.out.println("See you soon.");
                    break;
            }
        }
    }
}
