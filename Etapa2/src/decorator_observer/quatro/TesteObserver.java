package decorator_observer.quatro;

public class TesteObserver {
    public static void main(String[] args) {
        Acao acao = new Acao("INT3", 26.00);
        Corretora c1 = new Corretora("New Home Broke");
        Corretora c2 = new Corretora("Oldschool");
        acao.registraInteresse(c1);
        acao.registraInteresse(c2);
        acao.setValor(90.00);
    }
}
