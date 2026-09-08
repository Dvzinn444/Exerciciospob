package lista06.dominio;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String setMatricula(String matricula) {
        this.matricula = matricula;
        return matricula;
    }

    public double setNota1(double nota1) {
        this.nota1 = nota1;
        return nota1;
    }

    public double setNota2(double nota2) {
        this.nota2 = nota2;
        return nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarAprovacao());
    }
}
