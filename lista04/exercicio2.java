/*Exercício 2: Maior, Menor e suas Posições
Enunciado: Crie um programa que preencha um vetor de 10 números inteiros. O programa deve percorrer o 
vetor e identificar:
O maior valor e o índice onde ele se encontra.
O menor valor e o índice onde ele se encontra.
Conceitos: Inicialização de variáveis de controle com o primeiro elemento (vetor[0]), busca linear
 e rastreamento de índices.
 */
package lista04;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[10];

        System.out.print("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = ler.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        for (int i = 1; i < 10; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
            if(vetor[i] < menor) {
                menor = vetor[i];
                indiceMenor = i;
            }
        }
        System.out.println("Maior valor: " + maior + " na posição " + indiceMaior);
        System.out.println("Menor valor: " + menor + " na posição " + indiceMenor);
        ler.close();
    }
}
