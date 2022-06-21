
/** 1.Programa Java que lea dos números enteros por teclado y los muestre por pantalla. Muestra la media */

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {	
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		float num1=entrada.nextFloat();
		
		System.out.println("Introduzca el segundo numero: ");
		float num2=entrada.nextFloat();
		
		float media= (num1+num2)/2;
		System.out.println("La media es: " + media);
		
		entrada.close();
	}
}
