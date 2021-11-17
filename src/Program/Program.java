package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		/* aqui foi criado um programa para falar se o aluno 
		passou ou nao com base em suas notas, exibindo uma msg
		e quantos pontos faltaram
		/*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Insira seu nome: ");
		aluno.name = sc.nextLine();
		System.out.println("Insira sua nota: ");
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
		if (aluno.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		
		sc.close();	
	}

}
