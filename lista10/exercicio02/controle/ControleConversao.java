package lista10.exercicio02.controle;

import java.util.InputMismatchException;
import java.util.Scanner;
import lista10.exercicio02.dominio.ConversorVetor;

public class ControleConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorVetor conversor = new ConversorVetor();

        try {
            System.out.print("Digite um índice entre 0 e 3: ");
            int indice = scanner.nextInt();
            int valor = conversor.converter(indice);
            System.out.println("Valor convertido: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("O índice informado não existe no vetor.");
        } catch (NumberFormatException e) {
            System.out.println("O valor escolhido não é um número válido.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um índice inteiro.");
        } finally {
            scanner.close();
        }
    }
}