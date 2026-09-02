/*Exercício 1: Armazenamento e Leitura Inversa
Enunciado: Escreva um programa em Java que declare um array de 
inteiros de tamanho 5, leia os 5 valores informados pelo usuário e,
 em seguida, exiba todos os elementos na ordem inversa à que foram 
 digitados.
Conceitos: Declaração e instanciação de vetores, manipulação de 
índices e iteração decrescente (i--).
*/

package lista04;

import java.util.Scanner;

public class exercicio1{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[5];

        for(int i=0;i<5;i++){
        System.out.print("Digite um número: ");
        vet[i] = ler.nextInt();
        }

        for(int i=4;i>=0;i--){
            System.out.print(vet[i] + " ");
        }
        ler.close();
    }
}