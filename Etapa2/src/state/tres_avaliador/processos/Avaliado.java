package state.tres_avaliador.processos;

import java.util.Random;

public class Avaliado extends Processo {
    public Avaliado() {
        super(null, "");
    }

    @Override
    public void mostrarInformacao() {
        avaliar();
        System.out.println("Seu projeto foi: " + getInformacao());
    }

    private void avaliar() {
        Random r = new Random();
        setInformacao(r.nextDouble() > 0.5? "Deferido" : "Indeferido");
    }
}
