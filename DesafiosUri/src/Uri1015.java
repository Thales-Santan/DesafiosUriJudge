import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double x1,x2,y1,y2;
		
		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();
		
		System.out.printf("%.4f%n",Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2)));
		teclado.close();
	}

}
