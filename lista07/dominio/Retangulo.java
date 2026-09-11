package lista07.dominio;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura <= 0) {
            this.largura = 1; 
            System.out.println("Largura inválida. Definindo largura como 1.");
        }
        else{
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0) {
            this.altura = 1; 
            System.out.println("Altura inválida. Definindo altura como 1.");
        }
        else{
            this.altura = altura;    
        }
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
