package com.letscode.realtodolar;

import com.letscode.realtodolar.utils.ScannerMoney;

import java.text.NumberFormat;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
        double dollarToday = ScannerMoney.getDollarToday();
        double realValue = ScannerMoney.getRealValue();

        double convertedToDollar = realValue / dollarToday;

        System.out.printf("Real: %s %n Dollar: %s",NumberFormat.getCurrencyInstance().format(realValue), NumberFormat.getCurrencyInstance(Locale.US).format(convertedToDollar));
    }
}
