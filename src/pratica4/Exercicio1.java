package pratica4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int vet[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num, i = 0, aux = 0, position = 0;
		boolean flag = false;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar");
		num = leia.nextInt();
		
		leia.close();
		
		for (i = 0; i < vet.length; i++) {
			if(num == vet[i]) {
				position = i;
				aux = vet[i];
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("O número "+aux+" está localizado na posição: "+position);
		}else {
			System.out.println("O número "+num+" não foi encontrado!");
		}
		
		

	}

}
