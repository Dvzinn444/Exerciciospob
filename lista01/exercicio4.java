/*  Exercício 4: Área e Perímetro de um Retângulo
Enunciado: Faça um programa que leia a base e a altura de um retângulo. 
Em seguida, calcule e mostre:
A área (base * altura)
O perímetro (2  * (base + altura))
Conceitos: Atribuição de múltiplas saídas a partir dos mesmos dados de
 entrada.
Exemplo de Entrada: Base: 5.0, Altura: 3.0 Saída esperada: Área: 15.0,
 Perímetro: 16.0
 */

package lista01;

import java.util.Scanner;
import java.text.DecimalFormat;


public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0");

        System.out.print("Digite a base: ");
        double base = ler.nextDouble();
        System.out.print(   "Digite a altura: ");
        double altura = ler.nextDouble();

        double area = base * altura; 
        double perimetro = 2 * (base + altura);

        System.out.println("A área é: " + decimal.format(area));
        System.out.println("O perímetro é: " + decimal.format(perimetro));
        ler.close();
    }
}