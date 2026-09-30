package exercicio_em_sala;

import java.util.Scanner;

public class Exercicio01{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        try{
            
             System.out.print("Digite o primeiro numero: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo numero: ");
            int num2 = scanner.nextInt();
            System.out.print("Escolha a operação(1: + | 2: - | 3: * | 4: /): ");
            int operacao = scanner.nextInt();

            if(operacao == 1){
                
                int resultado = num1 + num2;
                System.out.println(resultado);

            }

            else if(operacao == 2){
                
                int resultado = num1 - num2;
                System.out.println(resultado);

            }

            else if(operacao == 3){
                
                int resultado = num1 * num2;
                System.out.println(resultado);

            }

            else if(operacao == 4){
                
                int resultado = num1 / num2;
                System.out.println(resultado);

            }
            else{
                System.out.println("Operação invalida");
            }

        } catch(ArithmeticException e){

            System.out.println("Tentativa de divisão por zero.");

        } catch(java.util.InputMismatchException e){

            System.out.println("Dado de entrada incorreto.");

        }

        scanner.close();
    }

}