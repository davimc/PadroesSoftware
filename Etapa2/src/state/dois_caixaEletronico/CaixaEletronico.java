package state.dois_caixaEletronico;

public class CaixaEletronico {
    private Conta contaTeste = new Conta(ContaState.NORMAL);

    public void tentativaSaque(double valor){
        System.out.println("Tentativa de saque em conta: " + contaTeste.getEstado().name());
        contaTeste.setEstado(contaTeste.getEstado().saque(valor));
    }
    public void tentativaDeposito(double valor){
        System.out.println("Tentativa de deposito em conta: " + contaTeste.getEstado().name());
        contaTeste.setEstado(contaTeste.getEstado().deposito(valor));
    }
    public static void main(String[] args) {
        CaixaEletronico cx = new CaixaEletronico();
        cx.tentativaDeposito(1000);
        cx.tentativaSaque(1000);
        cx.tentativaSaque(1000);
        cx.tentativaDeposito(1000);
        System.out.println("Estado atual: " + cx.contaTeste.getEstado());
    }
}
