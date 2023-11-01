package exercicio1;

import java.util.Scanner;

public class Venda {
	private int id;
	private String data;
	private Pizza pizza;
	private Cliente cliente;
	
	public Venda() {
		dadosVenda();
	}
	
	public void dadosVenda() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Id da venda: ");
		this.id = input.nextInt();
		input.nextLine();
		System.out.println("Data da venda: ");
		this.data = input.nextLine();
		
		Pizza piz = new Pizza();
		
		this.pizza = piz;
		
		Cliente cli = new Cliente();
		
		this.cliente = cli;
	}
	
	public void imprimirDados() {
		System.out.println("\nId da venda: " +getId());
		System.out.println("Data da venda: "+getData());
		System.out.println("\nId da pizza: "+getPizza().getId());
		System.out.println("Tamanho da pizza: "+getPizza().getTamanho());
		System.out.println("Valor da pizza: "+getPizza().getValor());
		System.out.println("\nId do Sabor: "+getPizza().getSabor().getId());
		System.out.println("Sabor da pizza: "+getPizza().getSabor().getNome());
		System.out.println("Ingredientes da pizza: "+getPizza().getSabor().getIngredientes());
		System.out.println("\nId do cliente: "+getCliente().getId());
		System.out.println("Nome do cliente: "+getCliente().getNome());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
