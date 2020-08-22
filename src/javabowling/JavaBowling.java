
package javabowling;

import java.util.Scanner;


public class JavaBowling {
     int frame [] = new int [9];
       
        int primerTiro;
        int segundoTiro;
        int tiro; 
       
        int puntos;
        int puntajeTotal = 0;
        
        
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        
        System.out.println("          MENU");
        System.out.println("");
        int opt = 0;
        do{
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            opt = leer.nextInt();
            switch (opt){
                case 1:
                    Frames obj = new Frames();
                    obj.frameMove();
                    
                   break;
                case 2:
                    System.out.println("Game over");
                   break;
            }
        }while (opt <=2); 
           
         
           
                   
           
           }
          }
    
    

