package dados;

import java.util.Scanner;
import java.util.Random;

public class Dados {

	public static void main(String[] args) {
		
		int lados, quant, result, i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de dados a rolar: ");
		quant = sc.nextInt();
		System.out.println("Digite o número de lados do dado a rolar: ");
		lados = sc.nextInt();
		
		System.out.printf("Rolando %d d%d: ", quant, lados);
		
		for (i = 0; i < quant; i++) {
			Random random = new Random();
			result = random.nextInt(lados)+1;
			System.out.printf(" %d ", result);
		}
		
		
	}

}
