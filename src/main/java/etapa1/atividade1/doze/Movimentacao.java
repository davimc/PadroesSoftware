package etapa1.atividade1.doze;

import java.util.Calendar;

public class Movimentacao implements Tributavel{
    private double valor;
    private Conta conta;
    private Calendar data;
    @Override
    public double encargo() {
        return valor*0.01;
    }
}
