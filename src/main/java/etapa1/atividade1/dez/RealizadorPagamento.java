package etapa1.atividade1.dez;

public class RealizadorPagamento {
    public static void main(String[] args) {
        Remuneravel r1,r2,r3;

        r1 = new Funcionario(4000,750);
        r2 = new Chefe(14000,8400);
        r3 = new Estagiario(900, 200);

        r1.calculaPagamento();
        r2.calculaPagamento();
        r3.calculaPagamento();
    }
}
