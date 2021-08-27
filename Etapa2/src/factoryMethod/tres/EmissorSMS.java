package factoryMethod.tres;

public class EmissorSMS implements Emissor{
    @Override
    public void envia(String message) {
        System.out.println("Enviando por SMS a mensagem: ");
        System.out.println(message);
    }
}
