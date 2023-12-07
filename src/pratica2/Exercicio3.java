package pratica2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);

		int numero, qtd;
		float total;

		System.out.println("Digite um número de 1 a 6: ");
		System.out.println("1 - Cachorro Quente"
				+" | 2 - X-Salada"
				+" | 3 - X-Bacon"
				+" | 4 - Bauru"
				+" | 5 - Refrigerente"
				+" | 6 - Suco de laranja");
		numero = leia.nextInt();

		System.out.println("Quantidade a comprar: ");
		qtd = leia.nextInt();
		
		leia.close();
		
		switch (numero) {
		case 1:
			total = qtd * 10.00f;
			System.out.printf("O valor do Cachorro Quente é de: R$ %.2f",total);
			break;
		case 2:
			total = qtd * 15.00f;
			System.out.printf("O valor do X-Salada é de: R$ %.2f",total);
			break;
		case 3:
			total = qtd * 18.00f;
			System.out.printf("O valor do X-Bacon é de: R$ %.2f",total);
			break;
		case 4:
			total = qtd * 12.00f;
			System.out.printf("O valor do Bauru é de: R$ %.2f",total);
			break;
		case 5:
			total = qtd * 8.00f;
			System.out.printf("O valor do Refrigerante é de: R$ %.2f",total);
			break;
		case 6:
			total = qtd * 13.00f;
			System.out.printf("O valor do Suco de laranja é de: R$ %.2f",total);
			break;
		}
			
	}

}
