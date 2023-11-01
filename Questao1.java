package exercicio1;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int par = 0, impar = 0, somaPar = 0, somaImpar = 0;
		
		for(int contador = 1; contador<=10; contador++) {
			System.out.println("Digite o " +contador+ "º Número: ");
			int num = input.nextInt();
			
			if(num%2==0) {
				par++;
				somaPar = somaPar + num;
			} else {
				impar++;
				somaImpar = somaImpar + num;
			}
		}
		
		System.out.println("\nQuantidade de Números Pares: " + par);
		System.out.println("Soma dos Números Pares: " + somaPar);
		System.out.println("\nQuantidade de Números Pares: " + impar);
		System.out.println("Soma dos Números Ímpares: " + somaImpar);
	}
	
	

}
