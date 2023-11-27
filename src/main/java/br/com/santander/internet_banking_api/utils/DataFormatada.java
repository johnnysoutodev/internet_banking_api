package br.com.santander.internet_banking_api.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataFormatada {

    public static String formatandoData(String dataString) {
        String formatoEntrada = "dd/MM/yyyy";
        String formatoSaida = "yyyy-MM-dd";

        DateTimeFormatter formatterEntrada = DateTimeFormatter.ofPattern(formatoEntrada);
        DateTimeFormatter formatterSaida = DateTimeFormatter.ofPattern(formatoSaida);

        try {
            LocalDate localDate = LocalDate.parse(dataString, formatterEntrada);
            return localDate.format(formatterSaida);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Ou você pode lançar uma exceção personalizada, dependendo dos requisitos.
        }
    }
}

