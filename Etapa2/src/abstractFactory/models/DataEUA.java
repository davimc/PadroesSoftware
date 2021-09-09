package abstractFactory.models;

import abstractFactory.factory.Data;

import java.util.Calendar;

public class DataEUA implements Data {

    @Override
    public String toString(Calendar data) {
        StringBuffer dataConvertida = new StringBuffer();
        dataConvertida.append(converterDiaSemana(data.get(Calendar.DAY_OF_WEEK)) + ", ");
        dataConvertida.append(data.get(Calendar.YEAR )+ "/");
        dataConvertida.append(data.get(Calendar.MONTH) + "/");
        dataConvertida.append(data.get(Calendar.DAY_OF_MONTH));
        return dataConvertida.toString();
    }

    private String converterDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "sun";
            case 2:
                return "mon";
            case 3:
                return "tue";
            case 4:
                return "wed";
            case 5:
                return "thu";
            case 6:
                return "fri";
            case 7:
                return "sat";

            default:
                return null;
        }
    }
}
