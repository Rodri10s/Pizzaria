package exercicio1;

import java.util.Scanner;

public class Cliente {
	private int id;
	private String nome;

	public Cliente() {
		dadosCliente();
	}

	public void dadosCliente() {
		Scanner input = new Scanner(System.in);

		System.out.println("\nId do cliente: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Nome do cliente: ");
		this.nome = input.nextLine();
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

}
