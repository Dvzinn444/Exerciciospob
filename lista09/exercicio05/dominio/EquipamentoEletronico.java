package lista09.exercicio05.dominio;

public abstract class EquipamentoEletronico {
    private String nome;
    private boolean ligado;

    public EquipamentoEletronico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " foi desligado.");
    }

    public abstract void executarFuncao();
}