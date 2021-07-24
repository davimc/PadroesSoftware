package atividade1.dez;

public class Estagiario implements Remuneravel {

    private double bolsa;
    private double auxilio;

    public Estagiario(double bolsa, double auxilio) {
        this.bolsa = bolsa;
        this.auxilio = auxilio;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public double getAuxilio() {
        return auxilio;
    }

    public void setAuxilio(double auxilio) {
        this.auxilio = auxilio;
    }

    @Override
    public void calculaPagamento() {
        depositaConta(getBolsa()+ getAuxilio());
    }

    @Override
    public void depositaConta(double valor) {
        System.out.println("Pagamento de "+ Estagiario.class.getSimpleName() + ":" + valor);
    }

}
