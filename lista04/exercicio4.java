package lista04;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número a ser buscado: ");
        int num = ler.nextInt();
        int[] vet = {1, 2, 3, 4, 5, 6};
        int id = -1;
        boolean achou = false;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                id = i;
                achou = true;
                break;
            }
        }

        if (achou) {
            System.out.print("O índice do " + num + " é: " + id);
        } else {
            System.out.print("O número não está no vetor");
        }
        ler.close();
    }
}