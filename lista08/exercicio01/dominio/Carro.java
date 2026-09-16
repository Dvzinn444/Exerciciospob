package lista08.exercicio01.dominio;

public class Carro extends Veiculo{
    int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas){
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}