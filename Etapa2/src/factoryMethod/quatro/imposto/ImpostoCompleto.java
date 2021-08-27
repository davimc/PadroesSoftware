package factoryMethod.quatro.imposto;

import factoryMethod.quatro.calculo.MetodoCalculo;

public class ImpostoCompleto extends ImpostoRenda {
    public ImpostoCompleto(MetodoCalculo calculo) {
        super(calculo);
    }
}
