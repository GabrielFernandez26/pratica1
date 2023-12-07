package pratica1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("Novo salário é: %.2f",novoSalario);
		
	}

}
