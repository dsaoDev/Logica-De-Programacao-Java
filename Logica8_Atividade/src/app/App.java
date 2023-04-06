package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<>();
		ArrayList<String> estoqueProdutos = new ArrayList<>();

		String nomeProduto;
		String dataDeVencimentoProduto = "04/2024";
		int numeroDeSerieProduto;
		double preco;
		String estoque;
		char opcao;

		System.out.println("Deseja iniciar o programa (S/N)");
		opcao = sc.next().charAt(0);

		while (opcao == 'S' || opcao == 's') {
			System.out.println("====     TABELA DE PRODUTOS   ===");
			System.out.println("numSerie  NomeProduto        PREÇO");
			System.out.println(" 1        BISCOITO           R$ 3.00  ");
			System.out.println(" 2        SALGADINHO         R$ 3.50");
			System.out.println(" 3        REFRIGERANTE       R$ 5.00");
			System.out.println(" 4        CHOCOLATE          R$ 2.50");
			System.out.println(" 5        MACARRÃO           R$ 6.00");
			System.out.println(" 6        ARROZ              R$ 6.50");

			System.out.println("Informe o nome do Produto que você deseja Cadastrar");
			sc.nextLine();
			nomeProduto = sc.nextLine();
			produtos.add(nomeProduto);
			System.out.println("Informe o numero de Serie do Produto");
			numeroDeSerieProduto = sc.nextInt();
			System.out.println("Informe o preço do Produto");
			preco = sc.nextDouble();

			if (numeroDeSerieProduto == 1) {
				estoque = "Estoque de Biscoito";
				estoqueProdutos.add(estoque);

			} else if (numeroDeSerieProduto == 2) {
				estoque = "Estoque de Salgadinho";
				estoqueProdutos.add(estoque);

			} else if (numeroDeSerieProduto == 3) {
				estoque = "Estoque de Refrigerante";
				estoqueProdutos.add(estoque);

			} else if (numeroDeSerieProduto == 4) {
				estoque = "Estoque de Chocolate";
				estoqueProdutos.add(estoque);
			} else if (numeroDeSerieProduto == 5) {
				estoque = "Estoque de Macarrão";
				estoqueProdutos.add(estoque);
			} else {
				estoque = "Estoque de Arroz";
				estoqueProdutos.add(estoque);
			}

			switch (numeroDeSerieProduto) {
			case 1:

				System.out.println("### RELATORIO DE PRODUTOS CADASTRADOS ###");
				System.out.printf(
						"Nome do Produto %s%nNúmero de serie do Produto atual: %d%nDataDeVencimento %s%nPreço do Produto cadastrado atualmente R$: %.2f%nEstoque: %s%n",
						produtos, numeroDeSerieProduto, dataDeVencimentoProduto, preco, estoqueProdutos);
				break;
			case 2:

				System.out.println("### RELATORIO DE PRODUTOS CADASTRADOS ###");
				System.out.printf(
						"Nome do Produto %s%nNúmero de serie do Produto atual: %d%nDataDeVencimento %s%nPreço do Produto cadastrado atualmente R$: %.2f%nEstoque: %s%n",
						produtos, numeroDeSerieProduto, dataDeVencimentoProduto, preco, estoqueProdutos);
				break;
			case 3:

				System.out.println("### RELATORIO DE PRODUTOS CADASTRADOS ###");
				System.out.printf(
						"Nome do Produto %s%nNúmero de serie do Produto atual: %d%nDataDeVencimento %s%nPreço do Produto cadastrado atualmente R$: %.2f%nEstoque: %s%n",
						produtos, numeroDeSerieProduto, dataDeVencimentoProduto, preco, estoqueProdutos);
				break;
			case 4:

				System.out.println("### RELATORIO DE PRODUTOS CADASTRADOS ###");
				System.out.printf(
						"Nome do Produto %s%nNúmero de serie do Produto atual: %d%nDataDeVencimento %s%nPreço do Produto cadastrado atualmente R$: %.2f%nEstoque: %s%n",
						produtos, numeroDeSerieProduto, dataDeVencimentoProduto, preco, estoqueProdutos);
				break;
			case 5:
				System.out.println("### RELATORIO DE PRODUTOS CADASTRADOS ###");
				System.out.printf(
						"Nome do Produto %s%nNúmero de serie do Produto atual: %d%nDataDeVencimento %s%nPreço do Produto cadastrado atualmente R$: %.2f%nEstoque: %s%n",
						produtos, numeroDeSerieProduto, dataDeVencimentoProduto, preco, estoqueProdutos);
				break;
			case 6:
				System.out.println("### RELATORIO DE PRODUTOS CADASTRADOS ###");
				System.out.printf(
						"Nome do Produto %s%nNúmero de serie do Produto atual: %d%nDataDeVencimento %s%nPreço do Produto cadastrado atualmente R$: %.2f%nEstoque: %s%n",
						produtos, numeroDeSerieProduto, dataDeVencimentoProduto, preco, estoqueProdutos);
				break;
			default:
				System.out.println("### ESTOQUE INEXISTENTE INFORME UM NUMERO DE SERIE EXISTENTE NO SISTEMA ###");
			}

			System.out.println("Deseja cadastrar outro Produto ? (S/N)");
			opcao = sc.next().charAt(0);
			if (opcao == 'N' || opcao == 'n') {
				System.out.println("==== PROGRAMA FINALIZADO === ");
			} else {

			}

		}

		sc.close();
	}

}
