package etapa2.atividade1.tres;

public class EmissorJMS implements Emissor{
    @Override
    public void envia(String message) {
        System.out.println("Enviando por JMS a mensagem: ");
        System.out.println(message);
    }
}
