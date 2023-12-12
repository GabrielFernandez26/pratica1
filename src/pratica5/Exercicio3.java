package pratica5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		Set<Integer> setNumeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor inteiro: ");
			num = leia.nextInt();
			setNumeros.add(num);
		}

		Iterator<Integer> iNumeros = setNumeros.iterator();
		System.out.println("Listar dados do Set: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

		leia.close();
	}

}
