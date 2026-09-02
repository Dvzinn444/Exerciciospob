package lista04;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double notas[] = new double[8];
        double soma = 0;

        for(int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do aluno: ");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }

        double media = soma / 8;
        System.out.println("Média da turma: " + media);

        for(int i = 0; i<8; i++) {
            if(notas[i] > media) {
                System.out.println("Aluno " + (i+1) + " com nota acima da média: " + notas[i]);
            }
        }
        ler.close();
    }
}
