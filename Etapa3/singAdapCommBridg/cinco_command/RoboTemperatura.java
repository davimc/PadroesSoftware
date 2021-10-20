package singAdapCommBridg.cinco_command;

public class RoboTemperatura implements RoboAction {
    private Experimento experimento;

    public RoboTemperatura(Experimento experimento) {
        this.experimento = experimento;
    }

    @Override
    public void execute() {
        experimento.aumentarTemperatura();
    }
    public void undo() {
        experimento.diminuirTemperatura();
    }
}
