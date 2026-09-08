package lista06.dominio.controle;

import lista06.dominio.circulo;
import java.util.Scanner;
import java.text.DecimalFormat;

public class controleCirculo {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        circulo c1 = new circulo(0);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Digite o raio do círculo: ");
        double raio = ler.nextDouble();
        c1.setRaio(raio);

        System.out.println("Área do círculo: " + df.format(c1.calcularArea()));
        System.out.println("Perímetro do círculo: " + df.format(c1.calcularPerimetro()));
        ler.close();
    }
}
