package aplicacao;

//import java.util.Locale;

import java.util.Scanner;

import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Produtos produtos = new Produtos();
		
		//CADASTRO
		System.out.print("Digite o nome do produto: ");
		produtos.nome = sc.nextLine();
		
		System.out.print("Digite o preço do produto: ");
		produtos.preco = sc.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		produtos.quantidade = sc.nextInt();
		
		//IMPRESSÃO
		System.out.println();
		System.out.println(produtos);
		
		//ADD
		System.out.print("Adicionar quantidade: ");
		int quantidade = sc.nextInt();
		produtos.addProdutos(quantidade);
		
		//IMPRESSÃO
		System.out.println();
		System.out.println("Atualização\n " + produtos);
		
		//REMOVER
		System.out.println();
		System.out.print("Remover quantidade: ");
		quantidade = sc.nextInt();
		produtos.removeProdutos(quantidade);
		
		//IMPRESSÃO
		System.out.println();
		System.out.println("Atualização\n " + produtos);
		
		sc.close();
	}

}
