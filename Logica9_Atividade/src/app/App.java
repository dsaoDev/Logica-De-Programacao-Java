package app;

public class App {

	public static void main(String[] args) {
		double[] numeros = new double[] { 25, 50, 30.60, 25.10, 25 };

		double soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma = soma + numeros[i];
			System.out.println(soma);
			
		}
		
	}

}
