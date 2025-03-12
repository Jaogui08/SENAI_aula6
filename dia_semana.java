package Projetos_LPA.aula6;

import java.util.Scanner;

public class dia_semana {

	public static void main(String[] args) {
		String[] opcoes = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o numero do dia da semana: ");
		int diasemana = scanner.nextInt();
		
		if (diasemana > 6 || diasemana < 0) {
			System.out.println("O numero selecionado é invalido");
		} else {
			System.out.println("hoje o dia é: " + opcoes[diasemana]);
		}
		
		scanner.close();

	}

}
