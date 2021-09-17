package decorator_observer.cinco;

public class Main {
    public static void main(String[] args) {
        BingoCard card1 = new BingoCard("Jogador1");
        BingoCard card2 = new BingoCard("Jogador2");
        BingoCard card3 = new BingoCard("Jogador3");
        BingoCard card4 = new BingoCard("Jogador4");
        BingoCard card5 = new BingoCard("Jogador5");

        BingoSystem bingo = new BingoSystem();
        bingo.registrarJogador(card1);
        bingo.registrarJogador(card2);
        bingo.registrarJogador(card3);
        bingo.registrarJogador(card4);
        bingo.registrarJogador(card5);

        bingo.sortearNumero();
    }
}
