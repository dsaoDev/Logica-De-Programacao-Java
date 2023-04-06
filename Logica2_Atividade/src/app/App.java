package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char letra;

		System.out.println("Informe a letra (M) - Masculino --- (F) - Feminino");
		letra = sc.next().charAt(0);

		if (letra == 'M') {
			System.out.println("Sexo Masculino");
		} else if (letra == 'F') {

			System.out.println("Sexo Feminino");

		} else {
			System.out.println("Sexo Invalido");
		}

		sc.close();
	}

}
