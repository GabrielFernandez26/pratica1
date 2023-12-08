package pratica3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, gen = 0, cargo = 0, idadeTotal = 0, total = 0, media = 0;
		int back = 0, front = 0, mobile = 0, fs = 0;

		String categoria = "s";

		while (!categoria.equalsIgnoreCase("n")) {

			System.out.println("Idade: ");
			idade = leia.nextInt();

			System.out.println("Identidade de Gênero: \n" + "1 - Mulher Cis \n" + "2 - Homem Cis \n"
			+ "3 - Não Binário \n" + "4 - Mulher Trans \n" + "5 - Homem Trans \n" + "6 - Outros \n");
			gen = leia.nextInt();

			System.out.println("Pessoa Desenvolvedora: \n" + "1 - Backend \n" + "2 - Frontend \n" + "3 - Mobile \n" + "4 - Fullstack \n");
			cargo = leia.nextInt();


			if ((gen == 1 || gen == 4) && cargo == 1) {
				front++;
			} else if ((gen == 2 || gen == 5) && cargo == 3 && idade > 40) {
				mobile++;
			} else if (gen == 3 && idade < 30) {
				fs++;
			} else if (cargo == 4) {
				back++;
			}

			total++;
			media = idadeTotal / total;
			
			System.out.println("Deseja continuar (S/N)");
			leia.nextLine();
			categoria = leia.nextLine();

			if (categoria.equals("n")) {
				System.out.println("O número de pessoas desenvolvedoras Backend: " + back);
				System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + front);
				System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobile);
				System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + fs);
				System.out.println("O número total de pessoas que responderam à pesquisa: " + total);
				System.out.println("A média de idade das pessoas que responderam à pesquisa " + media);
			}

		}

		leia.close();
	}

}
