/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 
 */
package adivinanumero_201313819;
import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author Cesar Javier Solares Orozco 201313819
 */
public class Adivinanumero_201313819 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {   
        Scanner sc = new Scanner(System.in);
        int n=0;
        Random r = new Random();
        int random= r.nextInt(100);
System.out.println("Bienvenido a Adivina un numero");
while(n!=random){

System.out.println("Introduce un numero entre 1 y 100");
n = sc.nextInt();
    if(n>100){
    System.out.println("El numero ingresado es mayor a 100 intente otra vez");
    }    
else if(n>random){
    System.out.println("El numero que ingresaste es incorrecto");
    System.out.println("El numero que ingresaste es mayor");
}
else if(n<random){
    System.out.println("El numero que ingresaste es incorrecto");
    System.out.println("El numero que ingresaste es menor");
}//termina ciclo if
}//termina ciclo while
   System.out.println("Ganaste");
    } //termina try
catch(Exception e){ 
System.out.println("Debes ingresar un numero"); 
    
   
        
    }//ternima try.catch
 }}

