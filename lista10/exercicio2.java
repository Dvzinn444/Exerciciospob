package lista10;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        String vet[] =  {"10", "25", "abc", "50"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o indice q deseja acessar:");
        int i = sc.nextInt();

        try{
            int valor = Integer.parseInt(vet[i]);
        } catch (NumberFormatException e) {
            System.out.println("Erro: o valor no indice " + i + " nao e um numero valido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: o indice " + i + " esta fora dos limites do vetor.");
        }
        sc.close();
    }
}
