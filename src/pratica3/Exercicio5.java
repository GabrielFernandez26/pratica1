package pratica3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int num = 1, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num > 0) {
				soma += num;
			}
			
		} while (num != 0);
		
		System.out.println("A soma dos números positivos é: "+soma);
		leia.close();

	}

}
