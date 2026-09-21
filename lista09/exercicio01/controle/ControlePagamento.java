package lista09.exercicio01.controle;

import lista09.exercicio01.dominio.MetodoPagamento;
import lista09.exercicio01.dominio.Pix;
import lista09.exercicio01.dominio.CartaoDeCredito;

public class ControlePagamento {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoDeCredito("1234567890123456", 1500.00);
        MetodoPagamento pix = new Pix("usuario@email.com");

        finalizarCompra(cartao, 250.00);
        finalizarCompra(pix, 80.00);

        finalizarCompra(cartao, 2000.00);
    }

    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        System.out.println("\n--- Iniciando Finalização de Compra ---");
        System.out.println("Método selecionado: " + metodo.obterDetalhes());
        metodo.processarPagamento(total);
        System.out.println("--- Compra Concluída ---");
    }
}
