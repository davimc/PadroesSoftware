package decorator_observer.um;

public abstract class EmissorDecorator implements Emissor {
    private Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }

    public Emissor getEmissor() {
        return emissor;
    }
}
