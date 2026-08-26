/*Exercício 5: Classificação de Triângulos

Enunciado: Crie um programa que leia os três lados de um triângulo (A, B e C). Primeiro, verifique se as medidas formam um triângulo válido (a soma de dois lados quaisquer deve ser sempre maior que o terceiro lado). Se for válido, classifique-o como:


Equilátero: Todos os três lados iguais.

Isósceles: Apenas dois lados iguais.

Escaleno: Todos os três lados diferentes.

Se não formar um triângulo, exiba uma mensagem de erro.

Conceitos: Condicionais aninhadas, validação de dados prévia e operadores de igualdade/desigualdade (==, !=).
 */
package lista02;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o lado A do triângulo: ");
        int ladoA = ler.nextInt();
        System.out.print("Digite o lado B do triângulo: ");
        int ladoB = ler.nextInt();
        System.out.print("Digite o lado C do triângulo: ");
        int ladoC = ler.nextInt();

        if((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("O triângulo é Equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("As medidas fornecidas não formam um triângulo válido.");
        }
        ler.close();
    }
}
