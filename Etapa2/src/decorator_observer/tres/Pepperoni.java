package decorator_observer.tres;

public class Pepperoni extends Pizza{

    @Override
    public String getDescricacao() {
        return super.getDescricacao() + "Pepperoni";
    }

    public Double cost() {
        return 14.90;
    }
}
