
/** 6.Programa que pase una velocidad en Km/h a m/s. 
 * La velocidad se lee por teclado.*/

import java.util.Scanner;

 public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca la velocidad en km/h ");
		double kh=entrada.nextDouble();
			
		System.out.printf("\nLa velocidad en m/s es: %f m/s.",(kh*1000/3600));
		
		entrada.close();
	}
}
