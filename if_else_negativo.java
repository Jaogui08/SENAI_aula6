package Projetos_LPA.aula6;

import java.util.Scanner;

public class if_else_negativo {

	public static void main(String[] args) {
		double numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero abaixo:");
		numero = scanner.nextDouble();
		
		if (numero == 0) {
			System.out.println("Seu numero é igual a 0");
		} else if (numero > 0) {
			System.out.println("Seu numero é positivo");
		} else {
			System.out.println("Seu numero é negativo");
		}
		
		scanner.close();

	}

}
