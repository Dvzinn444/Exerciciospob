package lista05;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[][] mat = new double[4][4];
        double soma = 0;

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println("Digite um número: ");
                double num = ler.nextDouble();
                mat[i][j] = num;
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
              if(i == j){
                soma += mat[i][j];
              }
            }
        }
        System.out.println("Soma dos elementos da diagonal principal: " + soma);
        ler.close();
    }
}
