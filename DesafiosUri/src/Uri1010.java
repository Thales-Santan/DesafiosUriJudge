import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner (System.in);
			
			int codPeca1 = input.nextInt();
			int quantPecas1 = input.nextInt();
			double valorUniP1 = input.nextDouble();
			
			int codPeca2 = input.nextInt();
			int quantPecas2 = input.nextInt();
			double valorUniP2 = input.nextDouble();
			double total = (valorUniP1 * quantPecas1) + (valorUniP2 * quantPecas2); 
			
			System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
			input.close();
	}

}
