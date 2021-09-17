package decorator_observer.tres;

public class TomateDecorator extends CondimentDecorator{
    public TomateDecorator(Pizza decoratedPizza) {
        super("Tomate",
                decoratedPizza);
    }

    @Override
    public Double cost() {
        return 0.10;
    }
}
