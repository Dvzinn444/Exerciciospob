package lista06.dominio;

public class circulo {
    double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    public double setRaio(double raio) {
        this.raio = raio;
        return raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}