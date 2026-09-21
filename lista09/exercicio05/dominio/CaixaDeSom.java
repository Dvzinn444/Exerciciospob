package lista09.exercicio05.dominio;

public class CaixaDeSom extends EquipamentoEletronico {
    public CaixaDeSom(String nome) {
        super(nome);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está reproduzindo música.");
    }
}