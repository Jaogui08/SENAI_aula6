package Projetos_LPA.aula6;

import java.util.Scanner;

public class medias_calculadas_invalido {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		nota1 = scanner.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		nota2 = scanner.nextDouble();
		
		System.out.print("Informe a terceira nota: ");
		nota3 = scanner.nextDouble();
		
		System.out.print("Informe a quarta nota: ");
		nota4 = scanner.nextDouble();
		
		double totalnota = (nota1 + nota2 + nota3 + nota4);
		media = (totalnota/4);
		
		if (media > 10 || media < 0) {
			System.out.println("Média inválida");
		} else if (media >= 6 || media < 10) {
			System.out.println("O aluno está aprovado com uma nota: " + media);
		} else if (media < 6 || media >= 4) {
			System.out.println("O aluno está reprovado e foi mandado para o exame com uma nota: " + media);
		} else {
			System.out.println("O aluno infelizmente está em recuperação com uma nota: " + media);
		}
		
		scanner.close();

	}

}
