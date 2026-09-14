package lista07.dominio;

public class Carro {
    private String modelo;
    private int velocidadeAtual = 0;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }   

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getAno() {
        return ano;
    }

    public void acelerar(int incremento) {
        if (incremento < 0) {
            System.out.println("Incremento inválido. Aceleração não realizada.");
            return;
        }
        velocidadeAtual += incremento;
    }

    public void frear(int decremento) {
        if (decremento < 0) {
            System.out.println("Decremento inválido. Frenagem não realizada.");
            return;
        }
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }   

    public boolean isEmMovimento() {
       if(velocidadeAtual > 0) {
            return true;
        } else {
            return false;
        }
    }
}
