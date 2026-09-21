package lista09.exercicio02.controle;

import lista09.exercicio02.dominio.Forma;
import lista09.exercicio02.dominio.Circulo;
import lista09.exercicio02.dominio.Retangulo;

public class ControleForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Vermelho", 5.0);
        Retangulo retangulo = new Retangulo("Azul", 4.0, 6.0);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        circulo.exibirCor();
        retangulo.exibirCor();
    }
}
