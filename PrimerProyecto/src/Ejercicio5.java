
/**5.Programa que lee por teclado el valor del radio de una circunferencia y 
 * calcula y muestra por pantalla la longitud y el área de la circunferencia. 
 * Longitud de la circunferencia = 2*PI*Radio, 
 * Area de la circunferencia = PI*Radio^2  */
 
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca el radio de la circunferencia ");
		double radio=entrada.nextDouble();
			
		System.out.println("La longitud de la circunferencia es: "+ 
		(2*Math.PI*radio));
		System.out.println("El area de la circunferencia es: "+ 
		(Math.PI*Math.pow(radio,2)));
		
		entrada.close();

	}

}
