package pratica5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que você deseja encontra: ");
		num = leia.nextInt();

		if (!numeros.contains(numeros.indexOf(num))) {
			System.out.println("O número " + num + " não foi encontrado!");
		} else {
			System.out.println("O número " + num + " está localizado na posição: "+numeros.indexOf(num));
		}

		leia.close();
	}

}
