package pratica6;

import java.util.Scanner;
import java.util.Stack;

public class Exemplo2 {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("**********************************************************\r\n"
					+ "\r\n"
					+ "1 - Adicionar livros na pilha\r\n"
					+ "2 - Listar todos os livros\r\n"
					+ "3 - Retirar Livro da pilha\r\n"
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
				String livro = leia.nextLine();
				livros.add(livro);
				System.out.println("Pilha: \n");
				for (String l : livros) {
					System.out.println(l);
				}
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				System.out.println("Lista de Livros na Pilha: \n");
				for (String l : livros) {
					System.out.println(l);
				}
				break;
			case 3:
				if (!livros.isEmpty()) {
					livros.pop();
					System.out.println("Pilha: \n");
					for (String l : livros) {
						System.out.println(l);
					}
					System.out.println("\nUm livro foi retirado da pilha!");
					break;
				} else {
					System.out.println("A Pilha está vazia!");
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
