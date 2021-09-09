package abstractFactory.models;

import abstractFactory.factory.Moeda;

import java.text.DecimalFormat;

public abstract class MoedaImpl implements Moeda {
    private String simbolo;

    public MoedaImpl(String simbolo) {
        this.simbolo = simbolo;
    }
    @Override
    public String toString(Double valor) {
        return simbolo+formatar(valor);
    }
    private String formatar(Double valor) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(valor);
    }
}
