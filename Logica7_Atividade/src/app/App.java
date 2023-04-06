package app;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();

		String nome = null;
		String CPF;
		String nomeBANCO;
		String contaBANCO;
		double saldoBANCO = 0;
		double valTRANSFERENCIA = 300.00;
		String nomeREMETENTE = "Lucas";
		double parcela1 = 1500.00;
		double parcela2 = 2500.00;
		double parcela3 = 4500.00;
		double parcela4 = 5500.00;
		double novoSALDOBANCO = 0;
		int opcao;
		int opcaoENTRADA;
		int opcaoNOVOPAGAMENTO;
		int escolha;

		System.out.println("(1)- Iniciar Sistema de Cadastro de Usuario (0)- Não fazer Cadastro");
		opcaoENTRADA = sc.nextInt();
		// loop do CADASTRO MENU 1
		while (opcaoENTRADA == 1) {
			System.out.println("### MENU DE CADASTRO DE USUARIOS ###");
			System.out.println("Informe seu Nome: ");
			nome = sc.next();
			System.out.println("Informe seu CPF");
			CPF = sc.next();
			System.out.println("Informe o nome do Banco sem ESPAÇOS");
			nomeBANCO = sc.next();
			System.out.println("Informe o número da  conta do Banco");
			contaBANCO = sc.next();
			//utilizei o RANDOM P gerar um SALDO NA CONTA DO USUARIO COMO SE FOSSE UM SALARIO
			saldoBANCO = aleatorio.nextDouble() * 10000.0 + 1;
			System.out.println(
					"DESEJA VER SEU RELATORIO (NOME CPF SALDO e ETC) E SUAS TRANSFERENCIAS? (1)- SIM (0)- NÃO");
			opcao = sc.nextInt();
			novoSALDOBANCO = saldoBANCO + 300.00;
			// RELATORIO DOS USUARIOS CADASTRADOS no case
			switch (opcao) {
			case 1:
				System.out.printf(
						"### RELATORIO GERAL ### \nNome: %s \nCPF: %s \nNomeBanco: %s \nContaDoBanco: %s \nSaldoDoBanco: %.2f%n",
						nome, CPF, nomeBANCO, contaBANCO, saldoBANCO);
				System.out.printf("Você recebeu %.2f de %s e seu novo Saldo é R$: %.2f%n", valTRANSFERENCIA,
						nomeREMETENTE, novoSALDOBANCO);

				break;
			default:
				if (opcao == 0) {
					break;
				} else {
					System.out.println("OPÇÃO INVALIDA");

				}

				break;
			}

			System.out.println("Deseja Cadastrar outro Usuario (1)-SIM (0)-NÃO");
			opcaoENTRADA = sc.nextInt();
		}
		// MENU 2
		System.out.println("### OPÇÕES DE PAGAMENTO ###");
		System.out.println("1. PARCELA DE 1500");
		System.out.println("2. PARCELA DE 2500");
		System.out.println("3. PARCELA DE 4500");
		System.out.println("4. PARCELA DE 5500");
		int opcaoPAGAMENTO;
		System.out.printf("INFORME SUA OPCAO DE PAGAMENTO CONFORME SEU SALDO MOSTRADO NA TELA R$: %.2f%n ",
				novoSALDOBANCO);
		opcaoPAGAMENTO = sc.nextInt();

		switch (opcaoPAGAMENTO) {
		case 1:
			if (opcaoPAGAMENTO == 1 && novoSALDOBANCO >= parcela1) {
				novoSALDOBANCO = novoSALDOBANCO - parcela1;
				System.out.printf("Pagamento efetuado com Sucesso" + " novo Saldo é R$: %.2f%n ", novoSALDOBANCO);

				// LOOP p parcela 1 SE O USUARIO QUER REALIZAR OUTRO PAGAMENTO
				System.out.println("Deseja realizar um novo pagamento? (1)SIM - - - - - (0)NÃO");
				opcaoNOVOPAGAMENTO = sc.nextInt();
				while (opcaoNOVOPAGAMENTO == 1) {
					System.out.printf(
							"Bem vindo novamente %s você escolheu a opção de realizar um novo pagamento seu Saldo é de %.2f%n",
							nome, novoSALDOBANCO);
					System.out.println("INFORME A PARCELA QUE DESEJA PAGAR DE ACORDO COM A TABELA ABAIXO");
					System.out.println("1. PARCELA DE 1500");
					System.out.println("2. PARCELA DE 2500");
					System.out.println("3. PARCELA DE 4500");
					System.out.println("4. PARCELA DE 5500");
					escolha = sc.nextInt();
					if (escolha == 1) {
						System.out.println("PAGAMENTO JÁ EFETUADO SELECIONE OUTRA PARCELA");

					} else if (escolha == 2 && novoSALDOBANCO >= parcela2) {
						novoSALDOBANCO = novoSALDOBANCO - parcela2;
						System.out.printf("Pagamento efetuado com Sucesso seu novo Saldo é R$: %.2f%n", novoSALDOBANCO);
					} else if (escolha == 3 && novoSALDOBANCO >= parcela3) {
						novoSALDOBANCO = novoSALDOBANCO - parcela3;
						System.out.printf("Pagamento efetuado com Sucesso seu novo Saldo é R$: %.2f%n", novoSALDOBANCO);
					} else if (escolha == 4 && novoSALDOBANCO >= parcela4) {
						novoSALDOBANCO = novoSALDOBANCO - parcela4;
						System.out.printf("Pagamento efetuado com Sucesso seu novo Saldo é R$: %.2f%n", novoSALDOBANCO);
					} else {
						System.out.println("OPÇÃO INVALIDA VOCÊ NÃO POSSUI SALDO SUFICIENTE...");
					}
					System.out.printf("seu Saldo é R$: %.2f deseja realizar um Novo Pagamento? %n", novoSALDOBANCO);
					System.out.println("(1)- SIM (0)- NÃO");
					opcaoNOVOPAGAMENTO = sc.nextInt();
				}

			} else {
				System.out.println("Saldo insuficiente para efetuar Pagamento");
			}
			break;
		// LOOP 2 P PARCELA 2 se O USUARIO QUER REALIZAR OUTRO PAGAMENTO
		case 2:
			if (opcaoPAGAMENTO == 2 && novoSALDOBANCO >= parcela2) {
				novoSALDOBANCO = novoSALDOBANCO - parcela2;
				System.out.printf("Pagamento efetuado com Sucesso" + " novo Saldo é R$: %.2f%n ", novoSALDOBANCO);
				System.out.println("Deseja realizar um novo pagamento? (1) SIM - - - - - (0) NÃO");
				opcaoNOVOPAGAMENTO = sc.nextInt();
				while (opcaoNOVOPAGAMENTO == 1) {
					System.out.printf(
							"Bem vindo novamente %s você escolheu a opção de realizar um novo pagamento seu Saldo é de %.2f%n",
							nome, novoSALDOBANCO);
					System.out.println("INFORME A PARCELA QUE DESEJA PAGAR DE ACORDO COM A TABELA ABAIXO");
					System.out.println("1. PARCELA DE 1500");
					System.out.println("2. PARCELA DE 2500");
					System.out.println("3. PARCELA DE 4500");
					System.out.println("4. PARCELA DE 5500");
					escolha = sc.nextInt();
					if (escolha == 1 & novoSALDOBANCO >= parcela1) {
						novoSALDOBANCO = novoSALDOBANCO - parcela1;
						System.out.printf("Pagamento efetuado com Sucesso seu novo Saldo é R$: %.2f%n", novoSALDOBANCO);
					} else if (escolha == 2) {
						System.out.println("PAGAMENTO JÁ EFETUADO SELECIONE OUTRA PARCELA");
					} else if (escolha == 3 && novoSALDOBANCO >= parcela3) {
						novoSALDOBANCO = novoSALDOBANCO - parcela3;
						System.out.printf("Pagamento Efetuado Com Sucesso seu novo Saldo é R$: %.2f%n", novoSALDOBANCO);
					} else if (escolha == 4 && novoSALDOBANCO >= parcela4) {
						novoSALDOBANCO = novoSALDOBANCO - parcela4;
						System.out.printf("Pagamento Efetuado com Sucesso seu novo Saldo é R$: %.2f%N", novoSALDOBANCO);
					} else {
						System.out.println("OPÇÃO INVALIDA VOCÊ NÃO TEM SALDO SUFICIENTE...");
					}
					System.out.println("Deseja Efetuar um novo pagamento (1)-SIM (0)-NÃO");
					opcaoNOVOPAGAMENTO = sc.nextInt();
				}

			} else {
				System.out.println("Você não tem saldo o suficiente para efetuar esse Pagamento");
			}
			break;
		// loop 3 P PARCELA 3 // USUARIO QUER REALIZAR OUTRO PAGAMENTO
		case 3:
			if (opcaoPAGAMENTO == 3 && novoSALDOBANCO >= parcela3) {
				novoSALDOBANCO = novoSALDOBANCO - parcela3;
				System.out.printf("Pagamento Efetuado com Sucesso" + " novo Saldo é R$: %.2f%n ", novoSALDOBANCO);
				System.out.println("Deseja efetuar um novo Pagamento ?(1)-SIM (0)-NÃO");
				opcaoNOVOPAGAMENTO = sc.nextInt();
				while (opcaoNOVOPAGAMENTO == 1) {
					System.out.printf(
							"Bem vindo novamente %s você escolheu a opção de realizar um novo pagamento seu Saldo é de %.2f%n",
							nome, novoSALDOBANCO);
					System.out.println("INFORME A PARCELA QUE DESEJA PAGAR DE ACORDO COM A TABELA ABAIXO");
					System.out.println("1. PARCELA DE 1500");
					System.out.println("2. PARCELA DE 2500");
					System.out.println("3. PARCELA DE 4500");
					System.out.println("4. PARCELA DE 5500");
					escolha = sc.nextInt();
					if (escolha == 1 && novoSALDOBANCO >= parcela1) {
						novoSALDOBANCO = novoSALDOBANCO - parcela1;
						System.out.printf("Pagamento Efetuado com Sucesso seu novo Saldo é %.2f%n", novoSALDOBANCO);
					} else if (escolha == 2 && novoSALDOBANCO >= parcela2) {
						novoSALDOBANCO = novoSALDOBANCO - parcela2;
						System.out.printf("Pagamento Efetuado com Sucesso seu novo Saldo é %.2f%n", novoSALDOBANCO);
					} else if (escolha == 3) {
						System.out.println("PAGAMENTO JÁ EFETUADO SELECIONE OUTRA PARCELA");
					} else if (escolha == 4 && novoSALDOBANCO >= parcela4) {
						novoSALDOBANCO = novoSALDOBANCO - parcela4;
						System.out.printf("Pagamento Efetudo com Sucesso seu novo Saldo é %.2f%n", novoSALDOBANCO);
					} else {
						System.out.println("OPÇÃO INVALIDA VOCê NÃO TEM SALDO SUFICIENTE...");
					}
					System.out.println("Deseja Realizar Efetuar um Novo pagamento? (1)-SIM (0)-NÃO");
					opcaoNOVOPAGAMENTO = sc.nextInt();
				}
			} else {
				System.out.println("Você não tem saldo o suficiente para efetuar esse Pagamento");
			}
			break;
		// loop 4 ULTIMO LOOP P PARCELA 4 // SE O USUARIO QUER REALIZAR OUTRO PAGAMENTO
		case 4:
			if (opcaoPAGAMENTO == 4 && novoSALDOBANCO >= parcela4) {
				novoSALDOBANCO = novoSALDOBANCO - parcela4;
				System.out.printf("Pagamento efetuado com Sucesso" + " novo Saldo é R$: %.2f%n ", novoSALDOBANCO);
				System.out.println("Deseja Efetuar um novo Pagamento? (1)-SIM (0)-NÃO");
				opcaoNOVOPAGAMENTO = sc.nextInt();
				while (opcaoNOVOPAGAMENTO == 1) {
					System.out.printf(
							"Bem vindo novamente %s você escolheu a opção de realizar um novo pagamento seu Saldo é de %.2f%n",
							nome, novoSALDOBANCO);
					System.out.println("INFORME A PARCELA QUE DESEJA PAGAR DE ACORDO COM A TABELA ABAIXO");
					System.out.println("1. PARCELA DE 1500");
					System.out.println("2. PARCELA DE 2500");
					System.out.println("3. PARCELA DE 4500");
					System.out.println("4. PARCELA DE 5500");
					escolha = sc.nextInt();
					if (escolha == 1 && novoSALDOBANCO >= parcela1) {
						novoSALDOBANCO = novoSALDOBANCO - parcela1;
						System.out.printf("Pagamento Efetuado com Sucesso seu Novo Saldo é %.2f%n", novoSALDOBANCO);
					} else if (escolha == 2 && novoSALDOBANCO >= parcela2) {
						novoSALDOBANCO = novoSALDOBANCO - parcela2;
						System.out.printf("Pagamento Efetuado com Sucesso seu novo Saldo é %.2f%n", novoSALDOBANCO);
					} else if (escolha == 3 & novoSALDOBANCO >= parcela3) {
						novoSALDOBANCO = novoSALDOBANCO - parcela3;
						System.out.printf("Pagamento Efetuado com Sucesso seu novo Saldo é %.2f%n", novoSALDOBANCO);
					} else if (escolha == 4) {
						System.out.println("PAGAMENTO JÁ EFETUADO SELECIONE OUTRA PARCELA");
					} else {
						System.out.println("OPÇÃO INVALIDA VOCÊ NÃO TEM SALDO SUFICIENTE...");
					}
					System.out.println("Deseja Realizar um novo Pagamento? (1)-SIM (0)-NÃO");
					opcaoNOVOPAGAMENTO = sc.nextInt();
				}
			} else {
				System.out.println("Você não tem saldo o suficiente para efetuar esse Pagamento");
			}
			break;
		default:
			System.out.println("OPERAÇÃO INVALIDA ...");
			break;
		}

		sc.close();
	}

}
