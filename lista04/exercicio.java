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

        for(int i=0; i < 10; i++){
            if(vet[i]%2==0){
                pares[i] = vet[i];
            } else {
                impares[i] = vet[i];
            }
        }

        for(int i=0; i < pares.length; i++){
            System.out.println("Números pares: " + pares[i]);
        }
        for(int i=0; i < impares.length; i++){
            System.out.println("Números ímpares: " + impares[i]);
        }
        ler.close();
    }   
}
