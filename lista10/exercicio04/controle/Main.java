package lista10.exercicio04.controle;

import lista10.exercicio04.dominio.Eleitor;
import lista10.exercicio04.dominio.IdadeInvalidaException;

public class Main {
    public static void main(String[] args) {
        Eleitor eleitor = new Eleitor();

        try {
            eleitor.cadastrar("Ana", 25);
            eleitor.cadastrar("Bruno", 150);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        try {
            eleitor.cadastrar("Carla", -2);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
}