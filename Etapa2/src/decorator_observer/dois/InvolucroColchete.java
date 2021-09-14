package decorator_observer.dois;

public class InvolucroColchete extends InvolucroDecorator{

    public InvolucroColchete(Involucro involucro) {
        super('[', ']', involucro);
    }
}
