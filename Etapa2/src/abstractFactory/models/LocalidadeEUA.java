package abstractFactory.models;

import abstractFactory.factory.Data;
import abstractFactory.factory.LocalidadeAbstractFactory;
import abstractFactory.factory.Moeda;

public class LocalidadeEUA implements LocalidadeAbstractFactory {
    @Override
    public Data getData() {
        return new DataEUA();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaEUA();
    }
}
