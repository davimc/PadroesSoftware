package etapa2.atividade1.tres;

public class EmissorCreator {
    public static final int SMS = 0;
    public static final int EMAIL = 1;
    public static final int JMS = 1;

    public Emissor create(int tipoEmissor) {
        if(tipoEmissor == EmissorCreator.SMS)
            return new EmissorSMS();
        if(tipoEmissor == EmissorCreator.EMAIL)
            return new EmissorEmail();
        if(tipoEmissor == EmissorCreator.JMS)
            return new EmissorJMS();
        else
            throw new IllegalArgumentException("Tipo de emissor não suportado");
    }
}
