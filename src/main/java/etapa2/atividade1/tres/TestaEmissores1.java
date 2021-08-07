package etapa2.atividade1.tres;

public class TestaEmissores1 {
    public static void main(String[] args) {
        Emissor emi1 = new EmissorSMS();
        emi1.envia("K19 Treinamentos");

        Emissor emi2 = new EmissorEmail();
        emi2.envia("K19 Treinamentos");

        Emissor emi3 = new EmissorJMS();
        emi3.envia("K19 Treinamentos");
    }
}
