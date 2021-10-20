package singAdapCommBridg.tres_singleton;

public class Aplicacao {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstante();
        log1.setAtivo(true);
        log1.log("PRIMEIRA MENSAGEM DE LOG");
        Logger log2 = Logger.getInstante();
        log2.log("SEGUNDA MENSAGEM DE LOG");
        System.out.println(log1.equals(log2));
    }
}
