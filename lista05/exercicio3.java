package lista05;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] mat = new int[3][4];
        int maior = Integer.MIN_VALUE;
        int maiorLinha = 0;
        int maiorColuna = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite um número: ");
                int num = ler.nextInt();
                mat[i][j] = num;                
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                if(mat[i][j] > maior){
                    maior = mat[i][j];
                    maiorLinha = i;
                    maiorColuna = j;
                }
            }
        }
        System.out.println("Linha: " + maiorLinha);
        System.out.println("Coluna: " + maiorColuna);
        ler.close();
    }
}
