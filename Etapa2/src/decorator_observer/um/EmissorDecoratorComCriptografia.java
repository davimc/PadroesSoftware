package decorator_observer.um;

public class EmissorDecoratorComCriptografia extends EmissorDecorator{
    public EmissorDecoratorComCriptografia(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando mensagem criptografada");
        this.getEmissor().envia(criptografia(mensagem));
    }

    private String criptografia(String mensagem) {
        String mensagemCriptografada  = new StringBuffer(mensagem).reverse().toString();
        return mensagemCriptografada;
    }
}
