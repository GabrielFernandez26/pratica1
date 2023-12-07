package pratica2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		leia.close();
		
		if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.println("O número "+numero+" é par e positivo");
			} else {
				System.out.println("O número "+numero+" é par e negativo");
			}
		} else {
			if (numero > 0) {
				System.out.println("O número "+numero+" é ímpar e positivo");
			} else {
				System.out.println("O número "+numero+" é ímpar e negativo");
			}
		}
	}

}
