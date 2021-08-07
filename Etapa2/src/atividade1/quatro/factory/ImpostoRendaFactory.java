package atividade1.quatro.factory;

import atividade1.quatro.calculo.Completo;
import atividade1.quatro.calculo.Simplificado;
import atividade1.quatro.imposto.ImpostoCompleto;
import atividade1.quatro.imposto.ImpostoRenda;
import atividade1.quatro.imposto.ImpostoSimplificado;

public class ImpostoRendaFactory {
    public static final int SIMPLES = 0;
    public static final int COMPLETO = 1;
    public static ImpostoRenda newImpostoRenda(int tipoImposto) {
        if(tipoImposto == ImpostoRendaFactory.SIMPLES)
            return new ImpostoSimplificado(new Simplificado());
        if(tipoImposto == ImpostoRendaFactory.COMPLETO)
            return new ImpostoCompleto(new Completo());
        else
            throw new IllegalArgumentException("Tipo não suportado");
    }
}