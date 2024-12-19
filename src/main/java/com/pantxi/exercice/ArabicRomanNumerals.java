package com.pantxi.exercice;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String ch = "null",ch1="",ch2="";
        String []tab={"I","II","III","IV","V","VI","VII","VIII","IX"};
        String []tab1={"X","XX","XXX","XXXX","L","LX","LXX","LXXX","XC"};
        int m=nbr%10;
        int x=nbr/10;
        int y=x%10;
        if(m!=0) ch=tab[m-1];
        if(y!=0)ch1=tab1[y-1];


        return ch1+ch;
    }
}

