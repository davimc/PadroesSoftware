package decorator_observer.dois;

public abstract class InvolucroDecorator implements Involucro{
    private char entrada;
    private char saida;
    private Involucro involucro;

    public InvolucroDecorator(char entrada, char saida, Involucro involucro) {
        this.entrada = entrada;
        this.saida = saida;
        this.involucro = involucro;
    }

    public String imprimir() {
        return entrada + involucro.imprimir() + saida;
    }

}
