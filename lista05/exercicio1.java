package lista05;

import java.util.Scanner;

public class exercicio5{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int[][] mat = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Digite um número: ");
                int num = ler.nextInt();
                mat[i][j] = num;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        ler.close();
    }
}
