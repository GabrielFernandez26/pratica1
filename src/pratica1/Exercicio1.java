package pratica1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		leia.close();
		
		novoSalario = salario + abono;
		System.out.printf("Novo salário é: %.2f",novoSalario);
	}

}
