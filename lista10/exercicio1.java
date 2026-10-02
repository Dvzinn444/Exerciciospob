package lista10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.print("Digite outro número: ");
            int outroNumero = scanner.nextInt();

            int resultado =  numero / outroNumero;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: valor inválido.");
        } finally {
            System.out.println("Operação concluída.");
            scanner.close();
        }
    }
}
