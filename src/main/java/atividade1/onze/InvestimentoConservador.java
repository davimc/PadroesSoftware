package atividade1.onze;

public class InvestimentoConservador implements Investimento{

    @Override
    public double calculaInvestimento(double saldo) {
        return (saldo+saldo*0.8);
    }

    @Override
    public String toString() {
        return "Investimento Conservador";
    }
}
