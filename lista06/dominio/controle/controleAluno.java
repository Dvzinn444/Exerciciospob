package lista06.dominio.controle;

import lista06.dominio.Aluno;
import java.util.Scanner;

public class controleAluno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno aluno = new Aluno(null, null, 0, 0);

		System.out.print("Digite o nome do aluno: ");
		aluno.setNome(ler.nextLine());
		System.out.print("Digite a matrícula do aluno: ");
		aluno.setMatricula(ler.nextLine());
		System.out.print("Digite a nota 1 do aluno: ");
		aluno.setNota1(ler.nextDouble());
		System.out.print("Digite a nota 2 do aluno: ");
		aluno.setNota2(ler.nextDouble());

		aluno.imprimirBoletim();
		ler.close();
	}
}
