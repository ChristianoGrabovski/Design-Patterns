package Strategy;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		/*
		try(Scanner entrada = new Scanner(System.in)){
			System.out.print("Infome a Distancia: ");
			
			int distancia = entrada.nextInt();
			System.out.print("Qual o tipo de frete (1) Normal, (2) Sedex");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete -1];
			
			Frete frete = tipoFrete.obterFrete();
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O valor total é de: R$%.2f", preco);
		}	
	*/


	
	Frete f1 = new Normal();
	System.out.println("O valor do frete tipo Normal eh de: " +f1.calcularPreco(10));
	
	
	Frete f2 = new Sedex();
	System.out.println("O valor do frete tipo sedex eh de: " + f2.calcularPreco(10));
	
	
	
	}	

}
