package factoryMethod.quatro;

import factoryMethod.quatro.factory.ImpostoRendaFactory;
import factoryMethod.quatro.imposto.ImpostoRenda;

public class TestaImposto {
    public static void main(String[] args) {
        ImpostoRenda ir1 = ImpostoRendaFactory.newImpostoRenda(0);
        System.out.println(ir1.calcula(2000));
        ImpostoRenda ir2 = ImpostoRendaFactory.newImpostoRenda(1);
        System.out.println(ir2.calcula(2000));
    }
}
