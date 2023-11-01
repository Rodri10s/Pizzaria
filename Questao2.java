package exercicio1;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int maior = 0;

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "º Número: ");
			int num = input.nextInt();
			
			if(num>maior) {
				maior = num;
			}
		}
		
		System.out.println("Maior número digitado: "+maior);

	}
}
