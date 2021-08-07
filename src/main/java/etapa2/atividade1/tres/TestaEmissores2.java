package etapa2.atividade1.tres;

public class TestaEmissores2 {
    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();
        Emissor emi1 = creator.create(0);
        emi1.envia("K19 Treinamentos");

        Emissor emi2 = creator.create(1);
        emi2.envia("K19 Treinamentos");

        Emissor emi3 = creator.create(2);
        emi3.envia("K19 Treinamentos");
    }
}
