import java.util.Locale;
import java.util.Scanner;
public class Uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		String nome;
		double salario, vendas,media;
		
		nome = teclado.next();
		salario = teclado.nextDouble();
		vendas = teclado.nextDouble();
		media = (vendas*0.15)+salario;
		/*Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas,
		 *  informar o total a receber no final do m�s, com duas casas decimais.*/
		System.out.printf("TOTAL = R$ %.2f%n",media);
		teclado.close();
	}

}