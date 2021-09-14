package decorator_observer.um;

public class Teste {
    public static void main(String[] args) {
        String mensagem = "Esta eh uma mensagem de teste";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        Emissor emissorCompress = new EmissorDecoratorComCrompressao(new EmissorBasico());
        emissorCompress.envia(mensagem);

        Emissor emissorCriptCompress = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCrompressao(new EmissorBasico()));
        emissorCriptCompress.envia(mensagem);
    }
}
