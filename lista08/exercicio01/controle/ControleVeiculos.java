package lista08.exercicio01.controle;

import lista08.exercicio01.dominio.Carro;
import lista08.exercicio01.dominio.Moto;
import lista08.exercicio01.dominio.Veiculo;

public class ControleVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("Toyota", "Corolla", 4);
        Veiculo veiculo2 = new Moto("Honda", "CBR500R", 500);

        System.out.println("Detalhes do veículo 1:");
        veiculo1.exibirDetalhes();

        System.out.println("\nDetalhes do veículo 2:");
        veiculo2.exibirDetalhes();
    }
}