package pratica4;

public class Exercicio3 {

	public static void main(String[] args) {
		int dpri = 0, dsec = 0;
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
		};

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == i) {
					dpri += mat[i][j];
					System.out.println("Elementos da Diagonal Principal: " + mat[i][j]);
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Elementos da Diagonal Secundária: " + mat[i][2 - i]);
			dsec += mat[i][2 - i];
		}

		System.out.println("Soma dos Elementos da Diagonal Principal: " + dpri);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + dsec);

	}

}
