package pratica2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int a, b, c;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();

		System.out.println("Digite o terceiro número: ");
		c = leia.nextInt();
		
		leia.close();
		
		if (a + b > c) {
			System.out.println("A soma de A + B é maior do que C");
		} else if (a + b < c) {
			System.out.println("A soma de A + B é menor do que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}
		
	}

}
