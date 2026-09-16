package lista07.dominio;

public class Funcionario{
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double novoSalario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = novoSalario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setSalario(double novoSalario){
        if(novoSalario > salario){
            this.salario = novoSalario;
        }
        else{
            System.out.println("Erro ao mudar o salario.");
        }
    }

    public double getSalario(){
        return salario;
    }

    public void exibirDados(){
        System.out.println("O nome do funcionário é: " + nome);
        System.out.println("A matricula do funcionáio é: " + matricula);
        System.out.println("O sálario do funcionário é: " + salario);
    }
}