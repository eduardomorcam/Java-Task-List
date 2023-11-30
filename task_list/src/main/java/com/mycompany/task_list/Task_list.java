package com.mycompany.task_list;
import java.util.Random;
import java.util.Scanner;
public class Task_list {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();        
        
        String[][] tareas = new String[11][7];
        tareas[0][0] = "Lunes";
        tareas[0][1] = "Martes";
        tareas[0][2] = "Miércoles";
        tareas[0][3] = "Jueves";
        tareas[0][4] = "Viernes";
        tareas[0][5] = "Sábado";
        tareas[0][6] = "Domingo";
        
        for(int i = 0; i < 7; i++){                                                             
            for(int e = 1; e < 11; e++){
                tareas[e][i] = "";
            }
        }
        
        int dia;
        int num = 1;
        String tarea;
        int contador; 
        
        while(num != 0){
            
          boolean vacia = false;                                                                                                                                        
            
          System.out.println("1 pa añadir tarea");
          System.out.println("2 pa ver tareas");
          System.out.println("3 pa borrar tarea");
          System.out.println("0 pa salir");
          num = sc.nextInt();
          
          while(num < 0 || num > 3){
              System.out.println("Error, vuelve a introducir un numero");
              num = sc.nextInt();
          }
          
          switch(num){
              case 1:
                  System.out.println("Añade la tarea: "); 
                  sc.nextLine();
                  tarea = sc.nextLine();
                  
                  System.out.println("Para que dia de la semana (1-7)?");
                  dia = sc.nextInt();
                  
                  while(dia < 1 || dia > 7){
                    System.out.println("Error, vuelve a introducir el dia");
                    dia = sc.nextInt();
                  }
                  
                  for(contador = 0; contador < 11; contador++){                              
                        if(tareas[contador][dia-1] == ""){                                                               
                            vacia = true;                                                                   
                            break;
                        }
                    }
                    
                    if(vacia){                                                                
                        tareas[contador][dia-1] = tarea;
                    } else {
                        System.out.println("Ya tienes 10 tareas ese dia, que numero de tarea quieres sobreescribir?");
                        contador = sc.nextInt();
                        tareas[contador][dia-1] = tarea;
                    }

                    System.out.println("Tarea añadida.");
                    
              case 2:
                  System.out.println("Estas son tus tareas pendientes: ");
                  for(int i = 0; i < 7; i++){                        
                      System.out.println(""); 
                      System.out.println(tareas[0][i]);
                      for(int e = 1; e < 11; e++){
                          System.out.println(e + "-" + tareas[e][i]); 
                      }
                  }
                  break;
              case 3:
                  System.out.println("Que dia?");
                  dia = sc.nextInt();
                  System.out.println("Que tarea?"); 
                  contador = sc.nextInt();
                  tareas[contador][dia-1] = "";                                                                                   
                  System.out.println("Tarea borrada");
                  break;
                    
                default:
                  System.out.println("See you soon.");
                    break;
          }
        }

    }
}
