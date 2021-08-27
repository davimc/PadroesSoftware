package state.dois_caixaEletronico;

public class Conta {
    private ContaState estado;

    public Conta(ContaState estado) {
        this.estado = estado;
    }
    public Conta saque(double valor){
        estado = estado.saque(valor);
        return this;
    }
    public Conta deposito(double valor) {
        estado = estado.deposito(valor);
        return this;
    }
    public ContaState getEstado() {
        return estado;
    }

    public void setEstado(ContaState estado) {
        this.estado = estado;
    }
}
