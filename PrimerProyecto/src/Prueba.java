
/** 2.Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”*/

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce tu nombre: ");
		
		Scanner entrada=new Scanner(System.in);
		String nombre= entrada.nextLine();
		//int num=entrada.nextInt();
		//float num=entrada.nextFloat();
		
		System.out.println("Su nombre es: " + nombre);
		
		entrada.close();
	}

}



