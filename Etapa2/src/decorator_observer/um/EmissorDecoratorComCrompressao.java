package decorator_observer.um;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCrompressao extends EmissorDecorator {
    public EmissorDecoratorComCrompressao(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando mensagem Comprimida");
        String mensagemComprimida;
        try {
            mensagemComprimida = compressao(mensagem);
        } catch (IOException e) {
            mensagemComprimida = mensagem;
        }
        this.getEmissor().envia(mensagemComprimida);
    }

    private String compressao(String mensagem) throws IOException{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(os, new Deflater());
        dos.write(mensagem.getBytes());
        dos.close();

        return new String(os.toByteArray());
    }
}
