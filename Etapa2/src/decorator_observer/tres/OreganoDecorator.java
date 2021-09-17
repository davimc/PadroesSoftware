package decorator_observer.tres;

public class OreganoDecorator extends CondimentDecorator{
    public OreganoDecorator(Pizza decoratedPizza) {
        super("Oregano",
                decoratedPizza);
    }

    @Override
    public Double cost() {
        return 0.50;
    }
}
