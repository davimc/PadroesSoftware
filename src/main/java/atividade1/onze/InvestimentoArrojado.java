package atividade1.onze;

import java.util.Random;

public class InvestimentoArrojado implements Investimento{
    @Override
    public double calculaInvestimento(double saldo) {
        Random random = new Random();
        double escolhido = random.nextDouble();
        if(escolhido<=0.20) return saldo+saldo*0.05;
        else
            if(escolhido<=0.50) return saldo+saldo*0.03;
            else return saldo+saldo*0.006;
    }

    @Override
    public String toString() {
        return "Investimento Arrojado";
    }
}
