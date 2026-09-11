package lista07.dominio.controle;

import lista07.dominio.Retangulo;
import java.util.Scanner;

public class controleRetangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(1, 1);

        System.out.println("Digite a largura do retângulo: ");
        retangulo.setLargura(ler.nextDouble());

        System.out.println("Digite a altura do retângulo: ");
        retangulo.setAltura(ler.nextDouble());

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        ler.close();
    }
}
