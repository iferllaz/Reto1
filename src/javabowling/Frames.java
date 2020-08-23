
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
                        
                            if (primerTiro == 10){
                                    segundoTiro = 0;

                                    puntos =  str.getStrike();
                                    
                                    System.out.println("Strike!!");
                                    System.out.println("Puntaje: "+puntaje);

                                    System.out.println("Tiras una vez mas: ");

                                    i--;
                                    puntajeTotal = puntaje + primerTiro + segundoTiro + puntajeTotal;
                                }
                        System.out.println("Puntaje de la siguiente bola:");
                        tiro = leer.nextInt();
                        segundoTiro = tiro;
                         
                            if (segundoTiro == obj.Spare()) {
                                    puntos = primerTiro + segundoTiro;
                                    puntaje = puntos + puntaje;
                                    System.out.println("Spare!!");
                                    System.out.println("Puntaje: "+puntaje);
                                    puntajeTotal = puntajeTotal + puntaje;
                                    }
                                
                            if (primerTiro == 0){
                                    puntos = empt.Empty();
                                    puntaje = puntaje + puntos; 
               
                                    System.out.println("Puntaje: "+puntaje);
                                    System.out.println("");
                                  }   
                        puntaje = puntaje + puntos;            
                        puntajeTotal = puntaje + primerTiro + segundoTiro + puntajeTotal;
                        System.out.println("primer tiro: "+primerTiro );
                        System.out.println("segundo tiro: "+ segundoTiro);
                        System.out.println("-----puntaje:" + puntaje);
                        System.out.println("Puntaje general hasta ahora: "+puntajeTotal);
                        System.out.println("----------------------");
                        System.out.println("");
                }
            return "Puntaje TOTAL: " + puntajeTotal;
        }   

                    
}
