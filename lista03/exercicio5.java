/*Exercício 5: Cálculo do Fatorial de um Número (for ou while)

Enunciado: Crie um programa que receba um número inteiro não negativo N e calcule o seu fatorial N!

Conceitos: Variável acumuladora de produto (inicializada em 1), controle de laço decrescente/crescente e tipo de dado numérico para evitar overflow (long).
*/
package lista03;

public class exercicio5 {
    public static void main(String[] args) {
        java.util.Scanner ler = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int N = ler.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + N + " é: " + fatorial);
    }
}
