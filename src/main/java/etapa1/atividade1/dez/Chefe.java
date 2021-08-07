package etapa1.atividade1.dez;

public class Chefe implements Remuneravel {

    private double salarioBase;
    private double bonificacoes;

    public Chefe(double salarioBase, double bonificacoes) {
        this.salarioBase = salarioBase;
        this.bonificacoes = bonificacoes;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificacoes() {
        return bonificacoes;
    }

    public void setBonificacoes(double bonificacoes) {
        this.bonificacoes = bonificacoes;
    }

    @Override
    public void calculaPagamento() {
        depositaConta(getSalarioBase()+ getBonificacoes());
    }

    @Override
    public void depositaConta(double valor) {
        System.out.println("Pagamento de "+ Chefe.class.getSimpleName() + ":" + valor);
    }

}
