package pratica2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario, novoSalario;
		
		System.out.println("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Código do cargo do colaborador (de 1 a 6): ");
		System.out.println("1 - Gerente"
				+ "| 2 - Vendedor"
				+ "| 3 - Supervisor"
				+ "| 4 - Motorista"
				+ "| 5 - Estoquista"
				+ "| 6 - Técnico de TI");
		codigo = leia.nextInt();
		
		System.out.println("Salário do colaborador: ");
		salario = leia.nextFloat();
		
		switch (codigo) {
		case 1:
			novoSalario = salario + (0.1f * salario);
			System.out.println("Nome do colaborador: \n"+nome+" Cargo: Gerente \n");
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 2:
			novoSalario = salario + (0.07f * salario);
			System.out.println("Nome do colaborador: \n"+nome+" Cargo: Vendedor \n");
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09f * salario);
			System.out.println("Nome do colaborador: \n"+nome+" Cargo: Supervisor \n");
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06f * salario);
			System.out.println("Nome do colaborador: \n"+nome+" Cargo: Motorista \n");
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05f * salario);
			System.out.println("Nome do colaborador: \n"+nome+" Cargo: Estoquista \n");
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08f * salario);
			System.out.println("Nome do colaborador: \n"+nome+" Cargo: Técnico de TI \n");
			System.out.printf("Salário: R$ %.2f",novoSalario);
			break;
		default:
			break;
		}
		
		leia.close();
	}

}
