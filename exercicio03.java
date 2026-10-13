/*Exercício 3: Dicionário de Frequência de Palavras (HashMap)
Enunciado: Escreva um programa que receba um texto (frase longa) do usuário, divida o texto em palavras 
separadas por espaços (utilizando .toLowerCase() e .split("\\s+")) e utilize um HashMap<String, Integer>
para contar a quantidade de ocorrências de cada palavra. Ao final, percorra o mapa exibindo cada palavra
e sua respectiva frequência.
Conceitos: Interface Map, pares chave-valor (put, getOrDefault), iteração sobre entrySet().
*/

package lista11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> freqPalavras = new HashMap<>();

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        if (!texto.isBlank()) {
            String[] palavras = texto.toLowerCase().trim().split("\\s+");
            for (String palavra : palavras) {
                freqPalavras.put(palavra, freqPalavras.getOrDefault(palavra, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : freqPalavras.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + ", Frequência: " + entry.getValue());
        }

        scanner.close();
    }
}
