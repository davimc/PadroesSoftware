package decorator_observer.cinco;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeradorNumeros {
    public static final Integer NUMERO_TOTAL_CARTELA = 7;
    private static Random random = new Random();

    public static Integer gerarNumero() {
        return random.nextInt(59)+1;
    }
    public static Set<Integer> gerarTabela(int qtd) {

        Set<Integer> numeros = new HashSet<>();
        while(numeros.size()<qtd) {
            numeros.add(random.nextInt(59)+1);
        }
        return numeros;
    }


}
