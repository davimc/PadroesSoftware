package state.tres_avaliador.processos;

public abstract class Processo implements Processavel {
    private Processavel processoSeguinte;
    private String informacao;

    public Processo(Processo processoSeguinte, String informacao) {
        this.processoSeguinte = processoSeguinte;
        this.informacao = informacao;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Processo de "+ getClass().getSimpleName() + " concluído." + "\nInformando: " + informacao + "\n");
    }
    public Processavel prosseguir() {
        mostrarInformacao();
        return processoSeguinte;
    }
}
