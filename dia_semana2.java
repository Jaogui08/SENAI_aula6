package Projetos_LPA.aula6;

import java.util.Scanner;

public class dia_semana2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int diasemana;
		
		System.out.print("Informe o dia da semana de hoje: ");
		diasemana = scanner.nextInt();
		
		if (diasemana == 1) {
			System.out.println("O dia de hoje é domingo");
		} else if (diasemana == 2) {
			System.out.println("O dia de hoje é segunda-feira");
		} else if (diasemana == 3) {
			System.out.println("O dia de hoje é terça-feira");
		} else if (diasemana == 4) {
			System.out.println("O dia de hoje é quarta-feira");
		} else if (diasemana == 5) {
			System.out.println("O dia de hoje é quinta-feira");
		} else if (diasemana == 6) {
			System.out.println("O dia de hoje é sexta-feira");
		} else if (diasemana == 7) {
			System.out.println("O dia de hoje é sábado");
		} else {
			System.out.println("O número escolhido é inválido");
		}
		
		scanner.close();

	}

}
