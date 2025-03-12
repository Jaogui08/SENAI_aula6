package Projetos_LPA.aula6;

import java.util.Scanner;

public class impar_par {

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número abaixo:");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
		
		scanner.close();

	}

}
