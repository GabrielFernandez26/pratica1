package pratica1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira a nota 4: ");
		nota4 = leia.nextFloat();
		
		leia.close();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média é: %.1f",media);
	}

}
