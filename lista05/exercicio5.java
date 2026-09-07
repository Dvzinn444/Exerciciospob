package lista05;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat1[][] = new int[2][3];
        int mat2[][] = new int[3][2];

        for (int i = 0; i < mat1.length; i++)
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.println("Digite um numero: ");
                mat1[i][j] = scanner.nextInt();
            }
    
    for (int i = 0; i < mat2.length; i++)
        for (int j = 0; j < mat2[i].length; j++){
            mat2[i][j] = mat1[j][i];
        }

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++)
                System.out.print(mat2[i][j] + " ");
            System.out.println();
        }
            scanner.close();
    }
}