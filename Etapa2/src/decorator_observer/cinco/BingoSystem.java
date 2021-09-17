package decorator_observer.cinco;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BingoSystem {

    private Set<Integer> numerosSorteados = new HashSet<>();
    private Set<BingoCard> cartoes = new HashSet<>();

    public void registrarJogador(BingoCard jogador) {
        cartoes.add(jogador);
    }

    public void sortearNumero() {
        while(numerosSorteados.size()<59) {
            int num = GeradorNumeros.gerarNumero();
            //Pesquisar como usar ternário sem precisar ter retorno.
            Boolean justAnUnsedFlag = numerosSorteados.contains(num) ? false : numerosSorteados.add(num);
            System.out.println(numerosSorteados);
            if(didIWin()) {
                System.out.println("Quantidade de numeros sorteados: " + numerosSorteados.size() + "\n numeros: " + numerosSorteados);
                return;
            }
        }
        System.out.println("Não houve Ganhadores");
    }

    private boolean didIWin() {
        Set<BingoCard> cardsVencedores = cartoes.stream()
                .filter(c -> numerosSorteados.containsAll(c.getNumerosCartela()))
                .collect(Collectors.toSet());
        if(cardsVencedores.size()>0) {
            cardsVencedores.stream().forEach(c -> c.notificaGanhador());
            return true;
        }
        return false;
    }

    public static final void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Set.of(1,39,2,3,55,4,62,5));
        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Set.of(1,2,3,4,5));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.containsAll(set2));

    }
}
