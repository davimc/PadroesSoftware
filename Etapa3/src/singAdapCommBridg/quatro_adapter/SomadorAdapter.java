package singAdapCommBridg.quatro_adapter;

import java.util.Arrays;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado{
    private SomadorExistente somador;

    public SomadorAdapter() {
        somador = new SomadorExistente();
    }

    public int somaLista(List<Integer> lista) {
        int[] vetor = new int[lista.size()];
        for(int i=0; i< lista.size();i++) {
            vetor[i] = lista.get(i);
        }
        somaVetor(vetor);
        return 0;

    }
    @Override
    public int somaVetor(int[] vetor) {
        return Arrays.stream(vetor).sum();
    }
}
