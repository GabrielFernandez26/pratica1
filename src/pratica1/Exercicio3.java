package pratica1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Insira o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();

		System.out.println("Insira as horas extras: ");
		horasExtras = leia.nextFloat();

		System.out.println("Insira os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("Salário líquido: %.2f",salarioLiquido);
	}

}
