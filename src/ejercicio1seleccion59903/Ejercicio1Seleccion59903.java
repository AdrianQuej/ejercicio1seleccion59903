/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion59903;
import java.util.Scanner;
/**
 *
 * @author Adrian Quej
 */
public class Ejercicio1Seleccion59903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero1 = 0;
    int numero2 = 0;
    int numero3 = 0;
    
    Scanner miConsola = new Scanner(System.in);
    System.out.println("Dime un numero : ");
    numero1 = miConsola.nextInt();
    
    System.out.println("Dime otro numero : ");
    numero2 = miConsola.nextInt();
    
    System.out.println("Dime un tercer numero : ");
    numero3 = miConsola.nextInt();
    
      if (numero1 > numero2){
        if (numero1 > numero3){
            System.out.println("El mayor numero es = " + numero1 );   
                                                                    }   
        else {
            System.out.println("El mayor numero es = " + numero3);
                                                                    }
      }else
          if (numero2 > numero3){
              System.out.println("El mayor numero es = " + numero2);
              
            }
          else 
              System.out.println("El mayor numero es = " + numero3);
      
      
      }
}