/*Exercício 2: Eliminação de Duplicatas e Operações de Conjunto (HashSet)
Enunciado: Desenvolva um programa que leia uma sequência de códigos de matrícula de alunos (inteiros) 
de duas turmas diferentes (Turma A e Turma B). Armazene cada turma em um HashSet<Integer> 
para eliminar registros duplicados de cada chamada. Em seguida, realize e exiba:
Todos os alunos matriculados nas duas turmas sem repetição (União: addAll()).
Apenas os alunos matriculados simultaneamente em ambas as turmas (Interseção: retainAll()).
Conceitos: Interface Set, unicidade de elementos, tabela hash e operações matemáticas de conjuntos.
*/

package lista11;

import java.util.HashSet;
import java.util.Set;

public class exercicio02 {
    public static void main(String[] args) {
        Set<Integer> turmaA = new HashSet<Integer>();
        Set<Integer> turmaB = new HashSet<Integer>();

        turmaA.add(101);
        turmaA.add(102);
        turmaA.add(103);
        turmaA.add(104);
        turmaA.add(105);

        turmaB.add(104);
        turmaB.add(105);
        turmaB.add(106);
        turmaB.add(107);
        turmaB.add(108);

        Set<Integer> uniao = new HashSet<Integer>(turmaA);
        uniao.addAll(turmaB);
        System.out.println("Alunos matriculados nas duas turmas (União): " + uniao);

        Set<Integer> intersecao = new HashSet<Integer>(turmaA);
        intersecao.retainAll(turmaB);
        System.out.println("Alunos matriculados em ambas as turmas (Interseção): " + intersecao);
    }    
}
