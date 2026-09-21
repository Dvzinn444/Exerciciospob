package lista09.exercicio05.controle;

import java.util.ArrayList;
import java.util.List;
import lista09.exercicio05.dominio.CaixaDeSom;
import lista09.exercicio05.dominio.Computador;
import lista09.exercicio05.dominio.Conectavel;
import lista09.exercicio05.dominio.EquipamentoEletronico;
import lista09.exercicio05.dominio.Televisao;

public class Main {
    public static void main(String[] args) {
        List<EquipamentoEletronico> equipamentos = new ArrayList<>();
        equipamentos.add(new Televisao("Smart TV"));
        equipamentos.add(new Computador("Computador do parque"));
        equipamentos.add(new CaixaDeSom("Caixa de som"));

        for (EquipamentoEletronico equipamento : equipamentos) {
            equipamento.ligar();
            equipamento.executarFuncao();

            if (equipamento instanceof Conectavel) {
                Conectavel conectavel = (Conectavel) equipamento;
                conectavel.conectarInternet();
            }
        }
    }
}