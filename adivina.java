import java.util.Scanner;
import java.util.Random;

public class Adivina{

    public static void main(String args[]) {
      
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
    
 }}

