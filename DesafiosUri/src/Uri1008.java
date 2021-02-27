import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri1008 {

	public static void main(String[] args) {
	Locale.setDefault(new Locale("en", "US"));
		
	int numeroFuncionario,horaTrabalhada;
	double salario,valorHora;
	
	DecimalFormat df = new DecimalFormat("####.00");
	Scanner ler = new Scanner(System.in);
	
	numeroFuncionario = ler.nextInt();
	horaTrabalhada = ler.nextInt();
	valorHora = ler.nextDouble();
	
	salario = valorHora * horaTrabalhada;
	
	System.out.println("NUMBER = "+numeroFuncionario);
	System.out.println("SALARY = U$ "+df.format(salario));
	
	ler.close();
	
	
	}

}
