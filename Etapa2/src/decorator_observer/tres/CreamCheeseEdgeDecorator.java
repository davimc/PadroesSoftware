package decorator_observer.tres;

public class CreamCheeseEdgeDecorator extends CondimentDecorator{
    public CreamCheeseEdgeDecorator(Pizza decoratedPizza) {
        super("Cream Cheese Edge",
                decoratedPizza);
    }

    @Override
    public Double cost() {
        return 1.20;
    }
}
