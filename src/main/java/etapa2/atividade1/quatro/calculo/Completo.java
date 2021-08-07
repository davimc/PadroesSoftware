package etapa2.atividade1.quatro.calculo;

public class Completo implements MetodoCalculo{
    @Override
    public double calcula(double valor) {
        System.out.println("cálculo completo sobre o valor "+ valor);
        return valor * 0.27;
    }
}
