package pratica3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, pares = 0, impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o "+i+"° número");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println("Total de pares: "+pares);
		System.out.println("Total de pares: "+impares);
		
		leia.close();
	}

}
