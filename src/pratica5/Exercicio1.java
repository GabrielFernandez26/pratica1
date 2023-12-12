package pratica5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		String cor;

		for (int i = 0; i < 5; i++) {
			System.out.println("Insira uma cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("Listar todas as cores: \n");
		for (String c : cores) {
			System.out.println(c);
		}
		
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: \n");
		
		for (String c : cores) {
			System.out.println(c);
		}
		
		leia.close();
	}
}
