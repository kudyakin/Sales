package utils;

import java.text.DecimalFormat;

public class Rounder {

    public static String round(double data) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(data);
    }

}
