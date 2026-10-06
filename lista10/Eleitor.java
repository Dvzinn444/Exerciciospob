package lista10;

{
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }

    public class Eleitor{
        private int idade;
        private String nome;

        public Eleitor(String nome, int idade) throws IdadeInvalidaException {
            this.nome = nome;
            if (idade < 0 || idade > 130) {
                throw new IdadeInvalidaException("Idade inválida: " + idade);
            }
            this.idade = idade;
        }
    }

    public class Main {
        public static void main(String[] args) {
            try {
                Eleitor eleitor = new Eleitor("João", 25);
                System.out.println("Eleitor criado com sucesso.");
            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
    

