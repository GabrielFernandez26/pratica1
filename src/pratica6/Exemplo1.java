package pratica6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("**********************************************************\r\n"
					+ "\r\n"
					+ "1 - Adicionar Cliente na Fila\r\n"
					+ "2 - Listar todos os Clientes\r\n"
					+ "3 - Retirar Cliente da Fila\r\n"
					+ "0 - Sair\r\n"
					+ "\r\n"
					+ "**********************************************************\r\n"
					+ "Entre com a opção desejada");
			System.out.println("\nDigite uma opção");
			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				String cliente = leia.nextLine();
				clientes.add(cliente);
				System.out.println("Fila: \n");
				for (String c : clientes) {
					System.out.println(c);
				}
				System.out.println("\nCliente adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: \n");
				for (String c : clientes) {
					System.out.println(c);
				}
				break;
			case 3:
				if (!clientes.isEmpty()) {
					clientes.poll();
					System.out.println("Fila: \n");
					for (String c : clientes) {
						System.out.println(c);
					}
					System.out.println("\nCliente foi Chamado!");
					break;
				} else {
					System.out.println("A Fila está vazia!");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			}
		} while (opcao != 0);

		leia.close();
	}

}
