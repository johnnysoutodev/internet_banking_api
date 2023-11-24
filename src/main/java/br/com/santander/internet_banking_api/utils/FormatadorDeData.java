package br.com.santander.internet_banking_api.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatadorDeData {

    private String strData;

    private static final DateTimeFormatter FORMATO_BRASILEIRO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));

    public static LocalDate converterStringParaData(String strData) {
        return LocalDate.parse(strData, FORMATO_BRASILEIRO);
    }

    public static String formatarData(LocalDate data) {
        return data.format(FORMATO_BRASILEIRO);
    }

}
