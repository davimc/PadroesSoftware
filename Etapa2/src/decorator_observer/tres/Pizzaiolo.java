package decorator_observer.tres;

import java.util.ArrayList;
import java.util.List;

public class Pizzaiolo {
    public static void main(String[] args) {
        List<Pizza> ps = new ArrayList();
        ps.add(new Mozzarella());
        ps.add(new TomateDecorator(new Mozzarella()));
        ps.add(new TomateDecorator(new CreamCheeseEdgeDecorator(new Pepperoni())));
        ps.add(new Pepperoni());
        ps.add(new BaconDecorator(new OreganoDecorator(new Pepperoni())));
        ps.add(new TomateDecorator(new BaconDecorator(new OreganoDecorator(new Pepperoni()))));

        ps.stream().forEach(p -> System.out.println(p.getDescricacao() + " Custo: " + p.cost()));
    }
}
