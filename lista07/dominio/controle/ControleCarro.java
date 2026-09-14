package lista07.dominio.controle;

import lista07.dominio.Carro;

public class ControleCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 1970);
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        carro.acelerar(50);
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());
        System.out.println("Em movimento? " + carro.isEmMovimento());

        carro.frear(20);
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());
        System.out.println("Em movimento? " + carro.isEmMovimento());
    }
}
