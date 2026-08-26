/* Exercício 2: Validador de Maioridade

Enunciado: Crie um programa que leia o ano de nascimento de uma 
pessoa e o ano atual. Calcule a idade e exiba se ela já é maior 
de idade (18 anos ou mais) ou menor de idade.

Conceitos: Operadores relacionais (>=) e subtração básica 
combinada com decisão.
 */
package lista02;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = ler.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = ler.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade >=18){
            System.out.print("Você é maior de idade!");
        }
        else{
            System.out.print("Você é menor de idade!");
        }
        ler.close();
    }
}
