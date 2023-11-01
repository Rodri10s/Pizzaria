package exercicio1;

import java.util.Scanner;

public class Sabor {
	private int id;
	private String nome;
	private String ingredientes;

	public Sabor() {
		dadosSabor();
	}

	public void dadosSabor() {
		Scanner input = new Scanner(System.in);

		System.out.println("\nId do Sabor: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Sabor da pizza: ");
		this.nome = input.nextLine();
		System.out.println("Ingredientes da pizza: ");
		this.ingredientes = input.nextLine();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
}
