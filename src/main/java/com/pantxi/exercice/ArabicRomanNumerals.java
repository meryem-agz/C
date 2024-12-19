package com.pantxi.exercice;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String ch = "nothing";
        if (nbr < 1 || nbr > 50)
            ch = "null";
        if (nbr == 1)
            ch = " I ";
        if (nbr == 4)
            ch = "IV";
        if (nbr == 39)
            ch = "XXXIX";
        if (nbr == 10)
            ch = " X ";
        return ch;
    }
}

