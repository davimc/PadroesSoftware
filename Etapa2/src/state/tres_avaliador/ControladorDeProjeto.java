package state.tres_avaliador;

import state.tres_avaliador.processos.Gestacao;
import state.tres_avaliador.processos.Processavel;

import java.util.ArrayList;
import java.util.List;

public class ControladorDeProjeto {
    private List<Processavel> processo = new ArrayList<>();

    public ControladorDeProjeto() {
        this.processo.add(new Gestacao());
    }

    public void realizaProjeto() {

        while (processo.get(processo.size() - 1) != (null)) {
            processo.add(processo.get(processo.size() - 1).prosseguir());
        }
    }
}
