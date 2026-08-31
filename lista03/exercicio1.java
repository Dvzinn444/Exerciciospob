/*Exercício 1: Tabuada de um Número (for)

Enunciado: Escreva um programa em Java que solicite um número inteiro ao usuário e exiba a sua tabuada 
de multiplicação de 1 a 10.

Conceitos: Laço de repetição com contador determinado (for), controle de iteração e concatenação de 
strings na saída.
 */

package lista03;

import java.util.Scanner;

public class exercicio1{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int num = ler.nextInt();

        for(int i=1;i<=10;i++){
            int result = num * i;
            System.out.println(num + "x" + i + "=" + result );
        }
    }
}