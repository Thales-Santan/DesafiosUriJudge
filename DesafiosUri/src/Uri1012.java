import java.util.*;
public class Uri1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n",(A*C)/2);
		System.out.printf("CIRCULO: %.3f%n",(3.14159*Math.pow(C, 2)));
		System.out.printf("TRAPEZIO: %.3f%n",((A+B)*C)/2);
		System.out.printf("QUADRADO: %.3f%n",B*B);
		System.out.printf("RETANGULO: %.3f%n",A*B);
		teclado.close();

	}

}
