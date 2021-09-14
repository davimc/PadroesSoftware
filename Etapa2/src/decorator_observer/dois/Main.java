package decorator_observer.dois;

public class Main {
    public static void main(String[] args) {
        Involucro invComTresColchetes = new InvolucroColchete(new InvolucroColchete(new InvolucroColchete(new NumeroUm())));
        System.out.println(invComTresColchetes.imprimir());

        Involucro invMisto = new InvolucroChave(new InvolucroColchete(new InvolucroParentese(new NumeroUm())));
        System.out.println(invMisto.imprimir());

        Involucro invUnicoParentese = new InvolucroParentese(new NumeroUm());
        System.out.println(invUnicoParentese.imprimir());
    }
}
