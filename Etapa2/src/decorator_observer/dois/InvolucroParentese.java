package decorator_observer.dois;

public class InvolucroParentese extends InvolucroDecorator{

    public InvolucroParentese(Involucro involucro) {
        super('(', ')', involucro);
    }
}
