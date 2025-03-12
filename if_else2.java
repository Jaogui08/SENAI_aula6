package Projetos_LPA.aula6;

import java.util.Scanner;

public class if_else2 {

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero abaixo: ");
		numero = scanner.nextInt();
		
		if (numero == 10) {
			System.out.println("Seu numero é igual a 10");
		} else if (numero > 10) {
			System.out.println("Seu numero é maior que 10");
		} else {
			System.out.println("Seu numero é menor que 10");
		}

	}

}
