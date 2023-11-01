package exercicio1;

public class CadastroVenda {
	public static void main(String[] args) {
		
		Venda vend = new Venda();
		
		System.out.println("\nId da venda: " +vend.getId());
		System.out.println("Data da venda: "+vend.getData());
		System.out.println("\nId da pizza: "+vend.getPizza().getId());
		System.out.println("Tamanho da pizza: "+vend.getPizza().getTamanho());
		System.out.println("Valor da pizza: "+vend.getPizza().getValor());
		System.out.println("\nId do Sabor: "+vend.getPizza().getSabor().getId());
		System.out.println("Sabor da pizza: "+vend.getPizza().getSabor().getNome());
		System.out.println("Ingredientes da pizza: "+vend.getPizza().getSabor().getIngredientes());
		System.out.println("\nId do cliente: "+vend.getCliente().getId());
		System.out.println("Nome do cliente: "+vend.getCliente().getNome());
		System.out.println("-----------------//-----------------");
		
		Venda vend2 = new Venda();
		
		vend2.imprimirDados();
	}
}
