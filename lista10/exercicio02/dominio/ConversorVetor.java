package lista10.exercicio02.dominio;

public class ConversorVetor {
    private static final String[] valores = {"10", "25", "abc", "50"};

    public int converter(int indice) {
        return Integer.parseInt(valores[indice]);
    }
}