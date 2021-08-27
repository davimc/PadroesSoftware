package factoryMethod.quatro.imposto;

import factoryMethod.quatro.calculo.MetodoCalculo;

public class ImpostoRenda {

    private MetodoCalculo calculo;

    public ImpostoRenda(MetodoCalculo calculo) {
        this.calculo = calculo;
    }

    public MetodoCalculo getCalculo() {
        return calculo;
    }

    public void setCalculo(MetodoCalculo calculo) {
        this.calculo = calculo;
    }

    public double calcula(double valor){
        return calculo.calcula(valor);
    }

}
