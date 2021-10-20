package singAdapCommBridg.cinco_command;

public class Teste {

    public static void main(String[] args) {
        Experimento ex1 = new Experimento();
        Experimento ex2 = new Experimento();


        RoboAction r1 = new RoboTemperatura(ex1);
        RoboAction r2 = new RoboTemperatura(ex2);
        RoboAction r3 = new RoboProdutoQuimico(ex1);
        RoboAction r4 = new RoboProdutoQuimico(ex2);

        r1.execute();
        r1.execute();
        r1.execute();
        r1.execute();
        r1.execute();
        r1.execute();
        r1.execute();

        r2.execute();

        r3.execute();

        r4.execute();
        r4.execute();
        r4.execute();
        r4.execute();

        ex1.informarEstado();
        ex2.informarEstado();
    }
}
