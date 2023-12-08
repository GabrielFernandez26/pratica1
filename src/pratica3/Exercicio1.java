package pratica3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo");
		num2 = leia.nextInt();
		
		
		if(num1 < num2) {
			for (int i = num1; i <= num2 ; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i+" é múltiplo de 3 e 5");
				}
			}	
		}else {
			System.out.println("Intervalo inválido");
		}
		
		leia.close();
	}

}
