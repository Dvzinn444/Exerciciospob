package lista09.exercicio05.dominio;

public class Televisao extends EquipamentoEletronico implements Conectavel {
    public Televisao(String nome) {
        super(nome);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está exibindo um canal.");
    }

    @Override
    public void conectarInternet() {
        System.out.println(getNome() + " foi conectada à internet.");
    }
}