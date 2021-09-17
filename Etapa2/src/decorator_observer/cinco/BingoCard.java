package decorator_observer.cinco;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BingoCard implements Jogador {
    private String nomeConcorrente;
    private Set<Integer> numerosCartela = new HashSet<>();

    public BingoCard(String nomeConcorrente) {
        this.nomeConcorrente = nomeConcorrente;
        this.numerosCartela = GeradorNumeros.gerarTabela(GeradorNumeros.NUMERO_TOTAL_CARTELA);
    }

    public String getNomeConcorrente() {
        return nomeConcorrente;
    }

    public void setNomeConcorrente(String nomeConcorrente) {
        this.nomeConcorrente = nomeConcorrente;
    }

    public Set<Integer> getNumerosCartela() {
        return numerosCartela;
    }

    public void setNumerosCartela(Set<Integer> numerosCartela) {
        this.numerosCartela = numerosCartela;
    }

    @Override
    public void notificaGanhador() {
        System.out.println("Cartela vencedora: " + getNumerosCartela() + " Ganhador: " + getNomeConcorrente());
    }
}
