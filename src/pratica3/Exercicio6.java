package pratica3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int num = 1, soma = 0, qtd = 0;
		double media = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num % 3 == 0 && num != 0) {
				qtd++;
				soma += num;
			}
		} while (num != 0);
		
		media = (double)(soma)/qtd;
		
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
		leia.close();
	}

}
