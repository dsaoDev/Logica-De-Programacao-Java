package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 1;

		while (cont <= 2) {
			System.out.println("### CADASTRO DE USUARIOS ###");
			System.out.println("Informe seu nome: ");
			String nome = sc.next();
			System.out.println("Informe sua idade: ");
			int idade = sc.nextInt();
			System.out.println("Informe seu sexo (M)- Masculino (F)- Feminino");
			char sexo = sc.next().charAt(0);
			System.out.println("Informe seu Gênero: ");
			String genero = sc.next();
			System.out.println("Usuario Cadastrado com Sucesso");
			System.out.println("Dados Cadastrados" + " Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo
					+ " Gênero: " + genero);
			cont++;

		}

		sc.close();

	}

}
