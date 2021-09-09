package abstractFactory.models;

import abstractFactory.factory.Data;
import abstractFactory.factory.LocalidadeAbstractFactory;
import abstractFactory.factory.Moeda;

public class LocalidadeBrasil implements LocalidadeAbstractFactory {
    @Override
    public Data getData() {
        return new DataBrasil();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaBrasil();
    }
}
