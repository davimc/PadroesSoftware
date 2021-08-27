package factoryMethod.quatro.factory;

import factoryMethod.quatro.calculo.Completo;
import factoryMethod.quatro.calculo.Simplificado;
import factoryMethod.quatro.imposto.ImpostoCompleto;
import factoryMethod.quatro.imposto.ImpostoRenda;
import factoryMethod.quatro.imposto.ImpostoSimplificado;

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
