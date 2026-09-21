package lista09.exercicio02.dominio;

public abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract String getCor(){
        return cor;
    }

    public abstract double calcularArea();

    public void exibirCor(){
        System.out.println("Cor da forma: " + cor);
    }

}
