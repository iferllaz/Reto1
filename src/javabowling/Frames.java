
package javabowling;

import java.util.Scanner;


public class Frames extends JavaBowling {
    Scanner leer = new Scanner (System.in); 
          Spare obj=new Spare();
          
     public String frameMove(){
            
            for(int i=0; i <= 9; i++){
                int juego = i+1;
                System.out.println("Puntaje de la primer bola en el juego "+juego+":");
                primerTiro = leer.nextInt();
                         if (primerTiro == 0){
                             Empty obj = new Empty();
                             obj.Empty();
                             puntajeTotal = puntajeTotal + puntos;
                             System.out.println("Puntos obtenidos: "+puntos);
                             System.out.println("");
                    }
                
                    if (primerTiro == 10){
                        Strike obj = new Strike();
                        obj.getStrike();
                        puntajeTotal = puntajeTotal + puntos;
                        siguienteTiro=0;
                        
                        System.out.println("Puntos obtenidos: "+puntos+". Ganaste 2 tiros mas.");
                        System.out.println("");
                        
                            }else{
                   
                                System.out.println("Puntaje de la siguiente bola:");
                                    siguienteTiro = leer.nextInt();
                                    
                                        if (primerTiro > 10 && siguienteTiro == obj.Spare()){
                                            puntos= primerTiro + siguienteTiro + puntajeTotal;
                                             
                                            System.out.println("Puntos obtenidos: "+puntos);
                        
                                             }
                                      }
                  System.out.println("Puntaje de la siguiente bola:");
                  primerTiro = leer.nextInt();
                  
                    puntajeTotal = puntajeTotal + puntos;
            }
                   return "Puntaje: " + puntajeTotal;
                    
                     
            }
}
          
            
        
