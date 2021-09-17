package decorator_observer.tres;

public abstract class CondimentDecorator extends Pizza {
    private String descricacao;
    private Pizza decoratedPizza;

    public CondimentDecorator(String descricacao, Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
        this.descricacao = descricacao;
    }

    @Override
    public String getDescricacao() {
        return super.getDescricacao().concat(super.getDescricacao().concat(", " + descricacao));
    }
}
