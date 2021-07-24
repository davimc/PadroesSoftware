package atividade1.onze;

public class RealizadorInvestimento {

    public void informaRendimento(Investimento in){
        System.out.println("Rendimento "+ in.toString() + ": "+in.calculaInvestimento(1000));
    }
    public static void main(String[] args) {
        Investimento in1,in2,in3;

        in1 = new InvestimentoConservador();
        in2 = new InvestimentoModerado();
        in3 = new InvestimentoArrojado();

        RealizadorInvestimento realiza = new RealizadorInvestimento();
        realiza.informaRendimento(in1);
        realiza.informaRendimento(in2);
        realiza.informaRendimento(in3);
    }
}
