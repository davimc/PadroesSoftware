package decorator_observer.tres;

public class Mozzarella extends Pizza{
    @Override
    public String getDescricacao() {
        return super.getDescricacao() + "Mozzarella";
    }

    public Double cost() {
        return 11.90;
    }
}
