package abstractFactory;

import abstractFactory.factory.Data;
import abstractFactory.factory.LocalidadeAbstractFactory;
import abstractFactory.factory.Moeda;

public class Cliente {
    private LocalidadeAbstractFactory factory;

    public Cliente(LocalidadeAbstractFactory factory) {
        this.factory = factory;
    }

    public Moeda criaMoeda() {
        return factory.getMoeda();
    }
    public Data criaData() {
        return factory.getData();
    }
}
