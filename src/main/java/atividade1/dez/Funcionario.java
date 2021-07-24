package atividade1.dez;

public class Funcionario implements Remuneravel {

    private double salario;
    private double bonus;

    public Funcionario(double salario, double bonus) {
        this.salario = salario;
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculaPagamento() {
        depositaConta(getSalario()+getBonus());
    }

    @Override
    public void depositaConta(double valor) {
        System.out.println("Pagamento de "+ Funcionario.class.getSimpleName() + ":" + valor);
    }

}
