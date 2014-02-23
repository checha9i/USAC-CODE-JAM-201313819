import java.util.Scanner;
public class Nprimo {

    public static void main(String args[])   {
    
          int ingreso;
 	  Scanner sc= new Scanner(System.in);
 	  int suma=0;

 	  System.out.println("Ingrese rango de los numeros.");
 	  ingreso = sc.nextInt();

 	  for(int i = 1; i <= ingreso; i++){
 	    for(int a = 1; a <= i; a++){
 	      if(i % a==0){
 	      suma++;
 	     }
 	    }
 	    if(suma == 2){
 	     System.out.println(i + " es primo");
 	     suma=0;
 	    }else{
 	      System.out.println(i);
 	      suma = 0;
 	     }
 	  }
    
    }
    }