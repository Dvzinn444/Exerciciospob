/* Exercício 4: O Maior de Três Números

Enunciado: Faça um programa que receba três números inteiros 
distintos e determine qual deles é o maior.

Conceitos: Comparações compostas com operadores relacionais e 
lógicos.
 */
package lista02;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = ler.nextInt();

        int maior;
        if(num1>num2 && num1>num3){
            maior = num1;
        }
        else if(num2>num3){
            maior = num2;
        }
        else{
            maior = num3;
        }
        System.out.println("O maior número é: " + maior);
    }
}
