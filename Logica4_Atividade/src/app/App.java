package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, altura;
		char sexo;
		char opcao;

		System.out.println("Voc� deseja iniciar o programa (S/N)");
		opcao = sc.next().charAt(0);

		while (opcao == 'S' || opcao == 's') {
			System.out.println("Informe seu peso");
			peso = sc.nextDouble();
			System.out.println("Informe sua altura");
			altura = sc.nextDouble();
			System.out.println("Informe seu Sexo (M/F) mai�sculo");
			sexo = sc.next().charAt(0);

			double imc = peso / (altura * altura);

			if (imc < 20.7 && sexo == 'M') {
				System.out.printf("Seu IMC � de %.1f e voc� est� abaixo do Peso %n", imc);
			} else if (imc >= 20.7 && imc <= 26.4 && sexo == 'M') {
				System.out.printf("Seu IMC  de %.1f e voc� est� no peso ideal %n", imc);
			} else if (imc >= 26.4 && imc <= 27.8 && sexo == 'M') {
				System.out.printf("Seu IMC � de %.1f e voc� est� marginalmente acima do peso %n", imc);
			} else if (imc >= 27.8 && imc <= 31.1 && sexo == 'M') {
				System.out.printf("SEU IMC � DE %.1f E VOC� EST� ACIMA DO PESO IDEAL %n", imc);
			} else if (imc > 31.1 && sexo == 'M') {
				System.out.printf("SEU IMC � DE %.1f e voc� est� OBESO %n", imc);
			} else {

			}
			if (imc < 19.1 && sexo == 'F') {
				System.out.printf("SEU IMC � DE %.1F e voc� est� abaixo do PESO %N", imc);
			} else if (imc >= 19.1 && imc <= 25.8 && sexo == 'F') {
				System.out.printf("SEU IMC � DE %.1F e voc� est� no peso ideal%n", imc);
			} else if (imc >= 25.8 && imc <= 27.3 && sexo == 'F') {
				System.out.printf("SEU IMC � DE %.1f e voc� esta marginalmente acima do peso%n", imc);
			} else if (imc >= 27.3 && imc <= 32.3 && sexo == 'F') {
				System.out.printf("SEU IMC � DE %.1f e voc� est� acima do PESO IDEAL%N", imc);
			} else if (imc > 32.3 && sexo == 'F') {
				System.out.printf("SEU IMC � DE %.1f e voc� est� obesa%n", imc);
			} else {

			}

			System.out.println("Deseja Cadastrar outro usuario (S/N)");
			opcao = sc.next().charAt(0);


	}
	}
	
	}
