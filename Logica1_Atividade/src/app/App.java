package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double peso, altura;
		char sexo;
		
		System.out.println("Informe o Peso do Usuario ");
		peso = sc.nextDouble();
		
		System.out.println("Informe a Altura do Usuario ");
		altura = sc.nextDouble();
		
		System.out.println("Informe o Sexo do Usuario 'M' ou 'F' ");
		sexo = sc.next().charAt(0);
		
		
		double imc = peso / (altura*altura);
		
		if (imc < 18.5) {
			System.out.printf("o Peso do usuario � %.2f KG , sua Altura � %.2f seu Sexo � %s e seu IMC � de %.1f ## Infelizmente Voc� se encontra abaixo do peso Coma mais um pouco ## %n", peso, altura, sexo, imc);
		}else if (imc >= 18.6 && imc <= 24.9){
			System.out.printf("o Peso do usuario � %.2f KG , sua Altura � %.2f seu Sexo � %s e seu IMC � de %.1f ##  Parab�ns Voc� se encontra no peso Ideal ## %n", peso, altura, sexo, imc);	
		}else
			System.out.printf("o Peso do usuario � %.2f KG , sua Altura � %.2f seu Sexo � %s e seu IMC � de %.1f ## Infelizmente voc� se encontra acima do peso coma menos ## %n", peso, altura, sexo, imc);
		
		sc.close();
		

	}

}
