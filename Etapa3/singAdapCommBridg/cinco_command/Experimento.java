package singAdapCommBridg.cinco_command;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    private int temperatura;
    private List<String> produtosQuimicos;

    public Experimento() {
        temperatura = 26;
        produtosQuimicos = new ArrayList<>();
    }

    public void aumentarTemperatura() {
        temperatura++;
    }
    public void diminuirTemperatura() {
        temperatura--;
    }
    public void inserirProdutoQuimico(String produto) {
        produtosQuimicos.add(produto);
    }
    public void retirarProdutoQuimico() {
        produtosQuimicos.remove(produtosQuimicos.size()-1);
    }
    public void informarEstado() {
        System.out.println("Experimento está rodando sobre os seguintes aspectos:\n" +
                "temperatura: " + temperatura+"º\n" +
                "lista de produtos químicos aplicados: {\n");
        for(String p: produtosQuimicos ){
            System.out.println(p+"\n");
        };
        System.out.println("}");
    }
}
