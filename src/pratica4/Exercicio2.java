package pratica4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int vet[] = new int[10];
		int num, soma = 0;
		float media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			vet[i] = num;
			soma += vet[i];
		}
		
		media = (float)(soma)/vet.length;
		
		System.out.println("Elementos nos índices ímpares: ");
		for (int i = 0; i < vet.length; i++) {
			if(i % 2 == 1 && vet[i] != 0) {
				System.out.print(+vet[i]+" ");
			}
		}
		
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 ==0 && vet[i] != 0) {
				System.out.print(vet[i]+" ");
			}
		}
		
		System.out.println("\nSoma: "+soma);
		System.out.printf("Média: %.2f",media);
		
		leia.close();
	}

}
