/*Exercício 3: Validação de Entrada com Senha (do-while ou while)

Enunciado: Desenvolva um programa que simule a autenticação de uma senha numérica (ex: 2026). 
O programa deve solicitar a senha repetidamente até que o usuário informe o valor correto. Para cada 
tentativa errada, exiba "Senha Incorreta! Tente novamente.". Quando correta, exiba "Acesso Permitido!".

Conceitos: Validação de entradas de usuário, condição booleana de continuidade e controle de fluxo.
 */

package lista03;

import java.util.Scanner;

public class exercicio3{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        final int senhaOf = 2026;
        boolean validar = false;

        do{
            System.out.print("Digite a senha: ");
            int senha = ler.nextInt();
            if(senha==senhaOf){
                System.out.println("Acesso Permitido!");
                validar = true;
            }
            else{
                System.out.println("Senha Incorreta! Tente novamente.");
            }

        }while (!validar);
    }
}