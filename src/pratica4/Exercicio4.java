package pratica4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		float aux = 0; 
		float notas[][] = new float[10][4];
		float media[] = new float[10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Insira a "+(j+1)+"a nota do alune "+(i+1));
				notas[i][j] = leia.nextFloat();
				aux += notas[i][j];
			}
			media[i] = aux/4;
			aux = 0;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%.1f",media[i]);
		}
		
		leia.close();
	}

}
