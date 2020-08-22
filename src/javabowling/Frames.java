
package javabowling;

import java.util.Scanner;


public class Frames extends JavaBowling {
    Scanner leer = new Scanner (System.in); 
    int frame [] = new int [9];
        int tiro=20;
        int primerTiro;
        int siguienteTiro;
        int puntos;
       
        int puntajeTotal = 0;
        Spare obj=new Spare();
                        
         
     public void frameMove(){
            
            for(int i=0; i <= 9; i++){
                System.out.println("Puntaje de la primer bola:");
                tiro = leer.nextInt();
                    if (primerTiro == 10){
                        Strike obj=new Strike();
                        obj.theStrike();
     //                   puntajeTotal= + puntos;
                        System.out.println("Puntos obtenidos: "+obj.theStrike()+" Ganaste 2 tiros mas.");
                    }else{
                   
                System.out.println("Puntaje de la siguiente bola:");
                siguienteTiro = leer.nextInt();
                     if (primerTiro > 10 && siguienteTiro == obj.Spare()){
                        puntos= primerTiro + siguienteTiro;
                        
                     }
                     
                    }
                    puntajeTotal = puntajeTotal + puntos;
            }
                    System.out.println("Puntaje: "+puntajeTotal);
                     //for(int j=0; i <= 9; i++){
                //System.out.println("Frame "+"["+i+"]:"+puntos);
                     }
            }
          
            
        
