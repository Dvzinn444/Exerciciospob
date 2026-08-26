/*Exercício 1: Par ou Ímpar

Enunciado: Escreva um programa em Java que leia um número 
inteiro e informe se ele é par ou ímpar.

Conceitos: Operador módulo (%) e estrutura if-else simples.
 */

package lista02;

import java.util.Scanner;

public class exercicio1{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        int num = ler.nextInt();

        if(num%2==0){
            System.out.print("É par!");
        }
        else{
            System.out.print("É impar!");
        }
        ler.close();
    }
}