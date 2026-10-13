/*Exercício 1: Gerenciamento de Lista Dinâmica de Tarefas (ArrayList)
Enunciado: Crie um programa que gerencie uma lista de tarefas utilizando ArrayList<String>. O programa 
deve permitir:
Adicionar 5 tarefas iniciais informadas pelo usuário.
Remover uma tarefa específica pelo seu índice ou nome.
Verificar se uma tarefa específica existe na lista (contains()).
Exibir a lista ordenada alfabeticamente utilizando Collections.sort().
Conceitos: Interface List, manipulação dinâmica de tamanho, busca e ordenação de listas.
 */
package lista11;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tarefa = new ArrayList<String>();

        System.out.println("Digite 5 tarefas iniciais:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Tarefa " + (i + 1) + ": ");
            String tarefaInput = scanner.nextLine();
            tarefa.add(tarefaInput);
        }

        tarefa.remove(2);
        boolean existe = tarefa.contains("Estudar Java");
        System.out.println("A tarefa 'Estudar Java' existe na lista: " + existe);
        Collections.sort(tarefa);
        for (String t : tarefa) {
            System.out.println(t);
        }
        scanner.close();
    }
}
