package lista06.dominio;

public class funcionario {
    String nome;
    String cargo;
    double salarioBruto;

    public funcionario(String nome, String cargo, double salarioBruto) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String setCargo(String cargo) {
        this.cargo = cargo;
        return cargo;
    }

    public double setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        return salarioBruto;
    }

    public double aplicarAumento(double percentual){
        double aumento = salarioBruto * (percentual / 100);
        salarioBruto += aumento;
        return salarioBruto;
    }

    public double calcularSalarioLiquido(double desconto){
        double salarioLiquido = salarioBruto - desconto;
        return salarioLiquido;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido(0)); // Exibe o salário líquido sem desconto
    }
}
