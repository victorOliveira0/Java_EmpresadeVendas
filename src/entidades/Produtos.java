package entidades;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double total() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ " \n Preço: R$"
				+ preco
				+ " \n Quantidade: "
				+ quantidade
				+ " \n Total: R$"
				+ total();
	}
	
}
