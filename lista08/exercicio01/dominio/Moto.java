package lista08.exercicio01.dominio;

public class Moto extends Veiculo{
    int Cilindradas;


    public Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo);
        this.Cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + Cilindradas);
    }
}