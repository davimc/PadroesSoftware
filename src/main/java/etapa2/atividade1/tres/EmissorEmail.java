package etapa2.atividade1.tres;

public class EmissorEmail implements Emissor{
    @Override
    public void envia(String message) {
        System.out.println("Enviando por e-mail a mensagem: ");
        System.out.println(message);
    }
}
