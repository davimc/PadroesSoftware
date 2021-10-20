package singAdapCommBridg.tres_singleton;

public class Logger {
    private static Logger logger = new Logger();
    private boolean ativo = false;
    private Logger() {
    }
    public boolean isAtivo() {
        return this.ativo;

    }
    public void setAtivo(boolean b) {
        this.ativo = b;
    }
    public void log(String s) {

        if (this.ativo)
            System.out.println("LOG :: " + s);

    }
    public static Logger getInstante() {
        return logger;
    }
}
