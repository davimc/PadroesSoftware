package abstractFactory;

import abstractFactory.factory.Data;
import abstractFactory.factory.Moeda;
import abstractFactory.models.LocalidadeBrasil;
import abstractFactory.models.LocalidadeEUA;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Cliente clienteBR = new Cliente(new LocalidadeBrasil());
        Cliente clienteEUA = new Cliente(new LocalidadeEUA());

        Moeda moeda = clienteBR.criaMoeda();
        Data data = clienteBR.criaData();

        System.out.println("Local: Brasil\nMoeda: "+ moeda.toString(25.00)+ "\nData: "+ data.toString(Calendar.getInstance())+"\n");

        moeda = clienteEUA.criaMoeda();
        data = clienteEUA.criaData();

        System.out.println("Local: Estados Unidos\nMoeda: "+ moeda.toString(25.00)+ "\nData: "+ data.toString(Calendar.getInstance()));
    }
}
