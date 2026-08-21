/*Exercício 3: Cálculo de Salário com Desconto do INSS
Enunciado: Desenvolva um programa que receba o valor da hora de 
trabalho de um funcionário e a quantidade de horas trabalhadas no mês.
 O programa deve calcular o salário bruto, descontar uma taxa fixa de 
 10% referente ao INSS e exibir o salário líquido final.
Conceitos: Multiplicação, cálculo percentual e variáveis intermediárias.
Exemplo de Entrada: Valor da hora: 50.00, Horas: 160  
Saída esperada: Salário Bruto: R$ 8000.00, Salário Líquido: R$ 7200.00
*/ 
package lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio3{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        DecimalFormat formatacao =  new DecimalFormat("#.00");

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorTrabalho = ler.nextDouble();
        System.out.print("Digite a qtd de horas trabalhadas: ");
        int horasTrabalho = ler.nextInt();

        double salarioBruto = valorTrabalho * horasTrabalho;
        double desconto = salarioBruto * 0.10;
        double salarioLiquido = salarioBruto - desconto;
        
    System.out.print("O sálario liquído é de " + formatacao.format(salarioLiquido));
    ler.close();
    }
}