import java.util.Scanner;

/*Leia um valor inteiro, que � o tempo de dura��o em segundos
de um determinado evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.*/
public class Uri1019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int N = input.nextInt();
		
		int Horas = (int) N / 3600;
		N = N - Horas*3600;
		int Minutos = (int) N /60;
		int Segundos = N - Minutos * 60;
		
		System.out.printf("%d:%d:%d%n",Horas,Minutos,Segundos);
		
		input.close();
	}

}
