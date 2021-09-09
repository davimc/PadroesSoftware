package abstractFactory.models;

import abstractFactory.factory.Data;

import java.util.Calendar;

public class DataBrasil implements Data {

    @Override
    public String toString(Calendar data) {

        return convertData(data);
    }

    private String convertData(Calendar data) {
        StringBuffer dataConvertida = new StringBuffer();
        dataConvertida.append(converterDiaSemana(data.get(Calendar.DAY_OF_WEEK)) + ", ");
        dataConvertida.append(data.get(Calendar.DAY_OF_MONTH) + "/");
        dataConvertida.append(data.get(Calendar.MONTH) + "/");
        dataConvertida.append(data.get(Calendar.YEAR));
        return dataConvertida.toString();
    }

    private String converterDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "dom";
            case 2:
                return "seg";
            case 3:
                return "ter";
            case 4:
                return "qua";
            case 5:
                return "qui";
            case 6:
                return "sex";
            case 7:
                return "sab";

            default:
                return null;
        }
    }
}
