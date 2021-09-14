package decorator_observer.dois;

public class InvolucroChave extends InvolucroDecorator{

    public InvolucroChave(Involucro involucro) {
        super('{', '}', involucro);
    }
}
