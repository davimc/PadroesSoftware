package singAdapCommBridg.seis_bridge;

public class Teste {
    public static void main(String[] args) {
        Documento cMenor = new Comprovante(new Menor());
        Documento cPadrao = new Comprovante(new Padrao());
        Documento rMenor = new Requisicao(new Menor());
        Documento rPadrao = new Requisicao(new Padrao());

        System.out.println(cMenor.formatar() + "\n" +
        cPadrao.formatar() + "\n" +
        rMenor.formatar() + "\n" +
        rPadrao.formatar());
    }
}
