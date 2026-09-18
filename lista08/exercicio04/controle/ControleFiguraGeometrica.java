package lista08.exercicio04.controle;

import lista08.exercicio04.dominio.Circulo;
import lista08.exercicio04.dominio.FiguraGeometrica;
import lista08.exercicio04.dominio.Quadrado;
import lista08.exercicio04.dominio.Retangulo;

public class ControleFiguraGeometrica {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5.0);
        FiguraGeometrica retangulo = new Retangulo(4.0, 6.0);
        FiguraGeometrica quadrado = new Quadrado(3.0);
        double vet[] = new double[3];
        vet[0] = circulo.calcularArea();
        vet[1] = retangulo.calcularArea();
        vet[2] = quadrado.calcularArea();

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Área da figura " + (i + 1) + ": " + vet[i]);
        }
    }
}
