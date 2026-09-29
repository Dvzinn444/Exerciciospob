package lista10.exercicio01.controle;

import java.util.InputMismatchException;
import java.util.Scanner;
import lista10.exercicio01.dominio.Calculadora;

public class ControleDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int segundoNumero = scanner.nextInt();

            int resultado = calculadora.dividir(primeiroNumero, segundoNumero);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite apenas números inteiros.");
        } finally {
            scanner.close();
            System.out.println("Operação finalizada.");
        }
    }
}