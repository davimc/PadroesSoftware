package atividade1.quatro.calculo;

public class Simplificado implements MetodoCalculo{
    @Override
    public double calcula(double valor) {
        System.out.println("cálculo simples sobre o valor "+ valor);
        return valor*0.15;
    }
}
