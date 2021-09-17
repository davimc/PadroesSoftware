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
        System.out.println("Por algum motivo que eu não entendi, ele salva os números das cartelas aleatório, mas os números sorteados ele ajeita em ordem crescente");
        while(numerosSorteados.size()<59) {
            int numSorteado = GeradorNumeros.gerarNumero();
            //Pesquisar como usar ternário sem precisar ter retorno.
            numerosSorteados.add(numSorteado);
            if(didIWin()) {
                System.out.println("Quantidade de numeros sorteados: " + numerosSorteados.size() + "\nNumeros: " + numerosSorteados);
                return;
            }
        }
        System.out.println("Não houve Ganhadores, Números sorteador: "+ numerosSorteados +"\nÀs vezes acontece. Tente rodar novamente.");
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
}
