package com.pantxi.exercice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {
    @Test
    void convert_cycle0() {
        ArabicRomanNumerals a = new ArabicRomanNumerals();
        String r = a.convert(0);
        assertEquals("null", r);
    }

    @Test
    void convert_cycle1() {
        ArabicRomanNumerals a = new ArabicRomanNumerals();
        String n = a.convert(1);
        assertEquals(" I ", n);
    }
    @Test
    void convert_cycle4(){
        ArabicRomanNumerals a=new ArabicRomanNumerals();
        String n=a.convert(4);
        assertEquals("IV",n);
    }
    @Test
    void convert_cycle10() {
        ArabicRomanNumerals a = new ArabicRomanNumerals();
        String n = a.convert(10);
        assertEquals(" X ", n);
    }
    @Test
    void convert_cycle39() {
        ArabicRomanNumerals a = new ArabicRomanNumerals();
        String n = a.convert(39);
        assertEquals("XXXIX", n);
    }
    @Test
    public void convert_all(){
        String[] expectedResults = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX","L"};
        for (int i = 1; i <= 50; i++) {
            String expected = expectedResults[i - 1]; // -1 car les indices du tableau commencent à 0
            assertEquals(expected, ArabicRomanNumerals.convert(i));
        }
     }
}
