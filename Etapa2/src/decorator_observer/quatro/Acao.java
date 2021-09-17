package decorator_observer.quatro;

import java.util.HashSet;
import java.util.Set;

public class Acao {
    private final String codigo;
    private double valor;
    private Set<AcaoObserver> interessados = new HashSet<>();

    public Acao(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
        interessados.stream().forEach(i -> i.notificaAlteracao(this));
    }
    public String getCodigo() {
        return codigo;
    }
    public void registraInteresse(AcaoObserver interessado) {
        this.interessados.add(interessado);
    }
    public void cancelaInteresse(AcaoObserver interessado) {
        this.interessados.remove(interessado);
    }

}
