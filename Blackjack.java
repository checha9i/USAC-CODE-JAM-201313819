import java.util.Scanner;
import java.util.Random;

public class Blackjack{

    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
        String ingreso;
        
      
        int suma,suma2;
        
System.out.println("Bienvenido a Blackjack");
       
    System.out.print("[x]\t [x]\n");

    
   System.out.println("¿Desea una carta mas? \n"+"Ingrese si o no");
 ingreso=sc.nextLine();

  if(ingreso.compareTo("si") ==0){
      
           int matriz[] = new int[3];
matriz[0] = (int)(Math.random()*11);
matriz[1] = (int)(Math.random()*11);
 matriz[2] = (int)(Math.random()*11);

  for (int y=0; y < matriz.length; y++) { 
  System.out.print("["+matriz[y]+"]");
    if (y!=matriz.length-1) System.out.print("\t");}
   suma=matriz[0]+matriz[1]+matriz[2];
System.out.println(" = "+suma);

if(suma==21){
System.out.println("Ganaste");
}else{System.out.println(" Perdiste");}
  }
           
  else {
      
              int matriz[] = new int[2];
matriz[0] = (int)(Math.random()*11);
matriz[1] = (int)(Math.random()*11);


  for (int y=0; y < matriz.length; y++) { 
  System.out.print("["+matriz[y]+"]");
    if (y!=matriz.length-1) {System.out.print("\t");}
   suma=matriz[0]+matriz[1];
System.out.println(" = "+suma);

if(suma==21){
System.out.println("Ganaste");
}else{System.out.println(" Perdiste");}
  }}
    
 }}

