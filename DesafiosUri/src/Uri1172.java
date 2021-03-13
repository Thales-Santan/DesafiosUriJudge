import java.util.Scanner;
public class Uri1172 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		int X[] = new int [10];
		
		for(int x = 0;x< X.length;x++) {
			X[x]=teclado.nextInt();
			if(X[x]<=0) {
				X[x] = 1;
			}
		}
		for (int i = 0;i<X.length;i++) {
			System.out.println("X["+i+"] = "+X[i]);
		}
		teclado.close();

	}

}
