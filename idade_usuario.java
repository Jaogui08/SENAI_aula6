package Projetos_LPA.aula6;

import java.util.Scanner;

public class idade_usuario {

	public static void main(String[] args) {
		int idade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		idade = scanner.nextInt();
		
		if (idade < 12) {
			System.out.println("Baseado em nossas informações, você é uma criança");
		} else if (idade >= 12 && idade <= 17) {
			System.out.println("Baseado em nossas informações, você é um adolescente");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Baseado em nossas informações, você é um adulto");
		} else {
			System.out.println("Baseado em nossas informações, você é um idoso");
		}
		
		scanner.close();

	}

}
