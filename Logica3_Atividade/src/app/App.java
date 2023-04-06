package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		char sexo;
		int idade, coditem, qtditem;
		double saldo;
		double camisa = 120.0;
		double calca = 100.0;
		double sapato = 300.0;
		double precoCAMISA = 0;
		double precoCALCA = 0;
		double precoSAPATO = 0;

		System.out.println("INFORME SEU NOME: ");
		nome = sc.nextLine();

		System.out.println("INFORME SUA IDADE: ");
		idade = sc.nextInt();

		System.out.println("Informe SEU SEXO(M) ou (F)");
		sexo = sc.next().charAt(0);

		System.out.println("INFORME O SALDO DA SUA CONTA R$: ");
		saldo = sc.nextDouble();

		System.out.println("### LOJA DE ROUPAS FUCTURA ###");
		System.out.println("### COD  ITEM    PREÇO ###");
		System.out.println("###  1   CAMISA  R$ 120.0");
		System.out.println("###  2   CALÇA   R$ 100.0");
		System.out.println("###  3   SAPATO  R$ 300.0");
		System.out.println("INFORME O CODIGO DO ITEM QUE VOCÊ DESEJA");
		coditem = sc.nextInt();
		System.out.println("INFORME O NOME DO PRODUTO QUE VOCE DESEJA");
		sc.nextLine();
		String nomeProduto = sc.nextLine();
		System.out.println("INFORME A QTD DO ITEM QUE VOCÊ DESEJA NO MINIMO 1");
		qtditem = sc.nextInt();

		if (coditem == 1) {
			System.out.printf("seu Saldo é R$: %.2f%n", saldo);
			precoCAMISA = camisa * qtditem;
			if (saldo >= precoCAMISA && qtditem != 0) {
				System.out.println("Compra Realizada com Sucesso");
			} else {
				System.out.println("seu Saldo é insuficiente não pode realizar a compra");
			}
		} else if (coditem == 2) {
			System.out.printf("Saldo é R$: %.2f%n", saldo);
			precoCALCA = calca * qtditem;
			if (saldo >= precoCALCA && qtditem != 0) {
				System.out.println("Compra Realizada com Sucesso");
			} else {
				System.out.println("seu Saldo é insuficiente não pode realizar a compra");

			}
		} else if (coditem == 3) {
			System.out.printf("Saldo é R$: %.2f%n", saldo);
			precoSAPATO = sapato * qtditem;
			if (saldo >= precoSAPATO && qtditem != 0) {
				System.out.println("Compra realizada com Sucesso");
			} else {
				System.out.println("seu Saldo é insuficiente não pode realizar a compra");

			}
		} else {
			System.out.println("Operação invalida");
		}

		double novosaldo = saldo - precoCAMISA;
		double novosaldo2 = saldo - precoCALCA;
		double novosaldo3 = saldo - precoSAPATO;

		switch (coditem) {
		case 1:
			if (saldo >= precoCAMISA) {
				System.out.printf(
						"NOTA FISCAL NOME: %s IDADE: %d SEXO: %s //SEU PRODUTO COMPRADO FOI %s //PREÇO DO PRODUTO COMPRADO: %.2f e Seu novo Saldo é R$ %.2f%n",
						nome, idade, sexo, nomeProduto, precoCAMISA, novosaldo);

			} else {
				System.out.println("Você não tem Saldo para realizar compras");
			}
			break;
		case 2:
			if (saldo >= precoCALCA) {
				System.out.printf(
						"NOTA FISCAL NOME: %s IDADE: %d SEXO: %s //SEU PRODUTO COMPRADO FOI %s //PREÇO DO PRODUTO COMPRADO: %.2f e Seu novo Saldo é R$ %.2f%n",
						nome, idade, sexo, nomeProduto, precoCALCA, novosaldo2);

			} else {
				System.out.println("Você não tem saldo para realizar compras");
			}
			break;
		case 3:
			if (saldo >= precoSAPATO) {
				System.out.printf(
						"NOTA FISCAL NOME: %s IDADE: %d SEXO: %s //SEU PRODUTO COMPRADO FOI %s //PREÇO DO PRODUTO COMPRADO: %.2f e Seu novo Saldo é R$ %.2f%n",
						nome, idade, sexo, nomeProduto, precoSAPATO, novosaldo3);
			} else {
				System.out.println("Você não tem saldo para realizar compras");
			}
			break;
		default:
			System.out.println("Você não realizou nenhuma compra seu saldo é R$: " + saldo);
		}

		sc.close();

	}

}
