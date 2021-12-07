package com.letscode.realtodolar.utils;

import java.util.Scanner;

public class ScannerMoney {
        public static double getDollarToday(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe a cotação do dolar hoje:");
            double dolarToday = sc.nextFloat();
            return dolarToday;
        };

    public static double getRealValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor em reais a ser convertido:");
        double realValue = sc.nextFloat();
        return realValue;
    };
}
