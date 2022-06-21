import java.util.Scanner;

/**7.Programa lea la longitud de los catetos de un triángulo rectángulo y calcule
 * la longitud de la hipotenusa según el teorema de Pitágoras.  */

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca la longitud de los catetos ");
		double cateto=entrada.nextDouble();
			
		System.out.printf("\nLa longitud de la hipotenusa es: %f", cateto);
		
		entrada.close();
	}
}
