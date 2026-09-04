package lista05;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] mat = new int[3][4];
        int somaLinha1 = 0;
        int somaLinha2 = 0;
        int somaLinha3 = 0;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.println("Digite um número: ");
                int num = ler.nextInt();
                mat[i][j] = num;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                if(i == 0){
                    somaLinha1 += mat[i][j];
                } else if(i == 1){
                    somaLinha2 += mat[i][j];
                } else if(i == 2){
                    somaLinha3 += mat[i][j];
                }
            }
        }
        System.out.println("Soma da linha 1: " + somaLinha1);
        System.out.println("Soma da linha 2: " + somaLinha2);
        System.out.println("Soma da linha 3: " + somaLinha3);
        ler.close();
    }
}
