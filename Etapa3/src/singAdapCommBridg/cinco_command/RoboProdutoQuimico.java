package singAdapCommBridg.cinco_command;

import java.util.Random;

public class RoboProdutoQuimico implements RoboAction {
    private final String[] produtosDisponiveis = new String[] {"DECENO", "DODECENO", "HEPTENO", "HEXENO",
        "METILPIRROLIDONA", "NAFTILAMINA", "NONENO"};
    private Experimento experimento;

    public RoboProdutoQuimico(Experimento experimento) {
        this.experimento = experimento;
    }

    @Override
    public void execute() {
        Random r = new Random();
        int aleatorio = r.nextInt(produtosDisponiveis.length-1);
        experimento.inserirProdutoQuimico(produtosDisponiveis[aleatorio]);
    }

    @Override
    public void undo() {
        experimento.retirarProdutoQuimico();
    }
}
