package lista09.exercicio05.dominio;

public class Computador extends EquipamentoEletronico implements Conectavel {
    public Computador(String nome) {
        super(nome);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está executando um programa.");
    }

    @Override
    public void conectarInternet() {
        System.out.println(getNome() + " foi conectado à internet.");
    }
}