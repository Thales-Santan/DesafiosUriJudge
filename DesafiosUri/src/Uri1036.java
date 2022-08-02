// Formula de Bhaskara / Formule Bhaskara
import java.util.Scanner;
import java.lang.Math;

public class Uri1036 {

	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
		
		double R1 = 0.0 , R2 = 0.0;
		double A = tc.nextDouble();
		double B = tc.nextDouble();
		double C = tc.nextDouble();
		
		double Delta = Math.pow(B,2) - 4*A*C;
		
		if(A==0 || Delta < 0) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			R1 = ((-(B)) + Math.sqrt(Delta)) / (2*A);
			R2 = ((-(B)) - Math.sqrt(Delta)) / (2*A);
			
			System.out.printf("R1 = %.5f%nR2 = %.5f%n",R1,R2);
		}
		
		
		tc.close();
	}

}
