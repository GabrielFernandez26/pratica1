package pratica1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		
		System.out.println("Inisira o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("Inisira o segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("Inisira o terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("Inisira o quarto numero: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença: %.1f",diferenca);
	}

}
