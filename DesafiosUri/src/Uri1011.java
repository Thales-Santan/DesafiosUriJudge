import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		final double PI = 3.14159;
		double R = teclado.nextDouble();
		System.out.printf("VOLUME = %.3f%n",((4/3.0)*PI*Math.pow(R, 3)));
		teclado.close();

	}

}
