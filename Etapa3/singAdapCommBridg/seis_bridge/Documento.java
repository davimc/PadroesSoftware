package singAdapCommBridg.seis_bridge;

public abstract class Documento {
    private Formatacao formatacao;
    private String documento;

    public Documento(Formatacao formatacao, String documento) {
        this.formatacao = formatacao;
        this.documento = documento;
    }

    public String formatar() {
        return documento + " " + formatacao.formatar();
    }
}
