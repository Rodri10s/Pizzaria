package exercicio1;

import java.util.Scanner;

public class Pizza {
	private int id;
	private String tamanho;
	private double valor;
	private Sabor sabor;

	public Pizza() {
		dadosPizza();
	}

	public void dadosPizza() {
		Scanner input = new Scanner(System.in);

		System.out.println("\nId da pizza: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Tamanho da pizza: ");
		this.tamanho = input.nextLine();
		System.out.println("Valor da pizza: ");
		this.valor = input.nextDouble();

		Sabor sab = new Sabor();

		this.sabor = sab;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

}
