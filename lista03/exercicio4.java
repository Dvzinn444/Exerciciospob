/*Exercício 4: Contagem de Números Pares e Ímpares em um Intervalo (for)

Enunciado: Faça um programa que leia dois valores inteiros que representam os limites de um 
intervalo fechado [A, B] (onde A <= B). O programa deve iterar por todos os números desse intervalo e 
exibir:

A quantidade de números pares.
A quantidade de números ímpares.

Conceitos: Estrutura de repetição for combinada com decisão condicional (if/else) e operador módulo (%).
*/
package lista03;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor de A (limite inferior): ");
        int A = ler.nextInt();
        System.out.print("Digite o valor de B (limite superior): ");
        int B = ler.nextInt();

        int countPares = 0;
        int countImpares = 0;

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);
        System.out.println("Quantidade de números ímpares: " + countImpares);
    }
}
