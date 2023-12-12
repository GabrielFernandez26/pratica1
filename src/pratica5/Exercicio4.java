package pratica5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;

		Set<Integer> setNumeros = new HashSet<Integer>();

		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		System.out.println("Digite o número que você deseja encontra: ");
		num = leia.nextInt();

		if (!setNumeros.contains(num)) {
			System.out.println("O número " + num + " não foi encontrado!");
		} else {
			System.out.println("O número " + num + " está localizado na posição: ");
		}

		leia.close();

	}

}
