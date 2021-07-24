package atividade1.onze;

import java.util.Random;

public class InvestimentoModerado implements Investimento{
    @Override
    public double calculaInvestimento(double saldo) {
        Random random = new Random();
        boolean escolhido = random.nextDouble()>=0.50;
        return escolhido?saldo+saldo*0.025:saldo+saldo*0.007;
    }

    @Override
    public String toString() {
        return "Investimento Moderado";
    }
}
