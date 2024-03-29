import java.util.Scanner;
public class Uri1018 {

/*Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode ser
 *decomposto. As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o 
 *de notas necess�rias.*/
/*Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, conforme o exemplo
 *fornecido. N�o esque�a de imprimir o fim de linha ap�s cada linha, caso contr�rio seu programa apresentar� a
 * mensagem: �Presentation Error�.
 */
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int valorEntrada = tc.nextInt();
		int cedulas[] = {100,50,20,10,5,2,1};
		
		System.out.println(valorEntrada);
		for(int cedula:cedulas) {
			int qtdNotas = valorEntrada/cedula;
			valorEntrada %= cedula;
			System.out.printf("%d nota(s) de R$ %d,00%n",qtdNotas,cedula);
		}
		tc.close();
	}
}
