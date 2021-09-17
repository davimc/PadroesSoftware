package decorator_observer.tres;

public class BaconDecorator extends CondimentDecorator{
    public BaconDecorator( Pizza decoratedPizza) {
        super("Bacon",
                decoratedPizza);
    }

    @Override
    public Double cost() {
        return 0.80;
    }
}
