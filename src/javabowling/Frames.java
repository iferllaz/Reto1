
package javabowling;

import java.util.Scanner;


public class Frames extends JavaBowling {
    Scanner leer = new Scanner (System.in); 
          Spare obj=new Spare();
          Strike str = new Strike();
          Empty empt = new Empty();
          
          
        public String frameMove(){

              

                for(int i=0; i <= 9; i++){
                    int juego = i+1;
                        System.out.println("Puntaje de la primer bola en el juego "+juego+":");
                        tiro = leer.nextInt();
                        primerTiro = tiro;
                        
                            if (primerTiro == 0){
                                 System.out.println("Puntaje de la siguiente bola:");
                                 tiro = leer.nextInt();
                                 segundoTiro = tiro;
                                 puntos = puntos + empt.Empty();
                                 
                                 puntajeTotal = puntajeTotal + puntos;
                                 System.out.println("Puntos obtenidos: "+puntos);
                                 System.out.println("");
                                  }
                            if (primerTiro < 10){
                                 System.out.println("Puntaje de la siguiente bola:");
                                 tiro = leer.nextInt();
                                 segundoTiro = tiro;
                                        if (segundoTiro == obj.Spare()) {
                                            puntos= primerTiro + segundoTiro + puntajeTotal;
                                            puntajeTotal = puntos + puntajeTotal;
                                            System.out.println("Puntaje: "+puntajeTotal);
                                            }
                                  }                  
                                      
                            if (primerTiro == 10){
                                segundoTiro = 0;
                               
                                puntos =  puntos + str.getStrike() + segundoTiro;
                                System.out.println("CHUZA! Puntos obtenidos: "+puntos+".");
                                 
                                System.out.println("Tiras una vez mas: ");
                              /*  tiro = leer.nextInt();
                                
                                        if (tiro == 10){
                                            segundoTiro = 0;
                                            primerTiro  = tiro;
                                            puntos =  str.getStrike() + segundoTiro;
                                            System.out.println("CHUZA! Puntos obtenidos: "+puntos+".");
                                                    if (tiro == 10){
                                                            System.out.println("Puntaje de la siguiente bola:");
                                                            tiro = leer.nextInt();
                                                                if (tiro == 10){
                                                                    segundoTiro = 0;
                                                                    primerTiro  = tiro;
                                                                    puntos =  str.getStrike() + segundoTiro;
                                                                    System.out.println("CHUZA! Puntos obtenidos: "+puntos+".");
                                                */   
                                i--;
                                puntajeTotal = puntos + primerTiro + segundoTiro + puntajeTotal;
                                }
                                        
                            }
                                    
                            puntajeTotal = puntos + primerTiro + segundoTiro + puntajeTotal;
                            System.out.println("Puntaje general hasta ahora: "+puntajeTotal);


                    

                    return "Puntaje TOTAL: " + puntajeTotal;
            }


}






