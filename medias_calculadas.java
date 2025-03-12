package Projetos_LPA.aula6;

import java.util.Scanner;

public class medias_calculadas {

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
		
		if (media == 6) {
			System.out.println("O aluno está aprovado com uma nota " + media);
		} else if (media > 6) {
			System.out.println("O aluno está aprovado com uma nota " + media);
		} else {
			System.out.println("Infelizmente o aluno está reprovado com uma nota " + media);
		}
		
		scanner.close();
	}

}
