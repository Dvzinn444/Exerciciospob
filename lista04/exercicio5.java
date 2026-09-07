package lista04;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vet[] = new int[10];
    
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            int num = ler.nextInt();
            vet[i] = num;
        }

        int pares[] = new int[10];
        int impares[] = new int[10];
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for(int i=0; i < 10; i++){
            if(vet[i]%2==0){
                pares[quantidadePares] = vet[i];
                quantidadePares++;
            } else {
                impares[quantidadeImpares] = vet[i];
                quantidadeImpares++;
            }
        }

        for(int i=0; i < quantidadePares; i++){
            System.out.println("Números pares: " + pares[i]);
        }
        for(int i=0; i < quantidadeImpares; i++){
            System.out.println("Números ímpares: " + impares[i]);
        }
        ler.close();
    }   
}
