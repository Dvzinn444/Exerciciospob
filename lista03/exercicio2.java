/*Exercício 2: Somatório e Média até Flag de Parada (while)

Enunciado: Crie um programa que leia continuamente números inteiros positivos fornecidos pelo usuário.
 A leitura deve ser encerrada imediatamente quando o usuário digitar um número negativo (flag de parada).
  Ao final, o programa deve exibir a quantidade de números digitados, a soma total e a média aritmética 
  deles (desconsiderando o valor negativo).

Conceitos: Laço com condição de parada indeterminada (while), acumulador de valores e contador 
de iterações.
 */
package lista03;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        double med;

        while(true){
            System.out.print("Digite um número: ");
            int num = ler.nextInt();

            if(num < 0){
                break;
            }

            soma += num;
            contador++;
        }

        if(contador > 0){
            med = (double) soma / contador;
            System.out.println("Quantidade de números digitados: " + contador);
            System.out.println("Soma total: " + soma);
            System.out.println("Média aritmética: " + med);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
    }
}
