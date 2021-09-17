package decorator_observer.tres;

public abstract class Pizza {
    private String descricacao;

    public String getDescricacao() {
        return "Pizza de ";
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public abstract Double cost();
}
