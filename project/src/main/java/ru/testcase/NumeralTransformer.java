package ru.testcase;

import java.util.HashMap;
import java.util.Map;

/**
 * This class helps to transform
 * digits/numbers from Arabic to
 * Rome and back
 * @author Egor Geraskin
 * @version 1.0 24.02.2020
 */
public class NumeralTransformer {
    /**
     * We need this map to change
     * Roman numeral into Arabic
     */
    private Map<String, Integer> romanToArabicNumeralsMap;
    {
        this.romanToArabicNumeralsMap = new HashMap<>();
        this.romanToArabicNumeralsMap.put("I", 1);
        this.romanToArabicNumeralsMap.put("II", 2);
        this.romanToArabicNumeralsMap.put("III", 3);
        this.romanToArabicNumeralsMap.put("IV", 4);
        this.romanToArabicNumeralsMap.put("V", 5);
        this.romanToArabicNumeralsMap.put("VI", 6);
        this.romanToArabicNumeralsMap.put("VII", 7);
        this.romanToArabicNumeralsMap.put("VIII", 8);
        this.romanToArabicNumeralsMap.put("IX", 9);
        this.romanToArabicNumeralsMap.put("X", 10);
    }

    /**
     * We need this map to change
     * Arabic numeral into Roman
     */
    private Map<Integer, String> arabicToRomanNumeralsMap;
    {
        this.arabicToRomanNumeralsMap = new HashMap<>();
        this.arabicToRomanNumeralsMap.put(0, "");
        this.arabicToRomanNumeralsMap.put(1, "I");
        this.arabicToRomanNumeralsMap.put(2, "II");
        this.arabicToRomanNumeralsMap.put(3, "III");
        this.arabicToRomanNumeralsMap.put(4, "IV");
        this.arabicToRomanNumeralsMap.put(5, "V");
        this.arabicToRomanNumeralsMap.put(6, "VI");
        this.arabicToRomanNumeralsMap.put(7, "VII");
        this.arabicToRomanNumeralsMap.put(8, "VIII");
        this.arabicToRomanNumeralsMap.put(9, "IX");
        this.arabicToRomanNumeralsMap.put(10, "X");
    }

    /**
     * We need this map to change
     * Arabic numeral into Roman
     * Decimal digits
     */
    private Map<Integer, String> decimalArabicToRomanNumeralsMap;
    {
        this.decimalArabicToRomanNumeralsMap = new HashMap<>();
        this.decimalArabicToRomanNumeralsMap.put(0, "");
        this.decimalArabicToRomanNumeralsMap.put(1, "X");
        this.decimalArabicToRomanNumeralsMap.put(2, "XX");
        this.decimalArabicToRomanNumeralsMap.put(3, "XXX");
        this.decimalArabicToRomanNumeralsMap.put(4, "XL");
        this.decimalArabicToRomanNumeralsMap.put(5, "L");
        this.decimalArabicToRomanNumeralsMap.put(6, "LX");
        this.decimalArabicToRomanNumeralsMap.put(7, "LXX");
        this.decimalArabicToRomanNumeralsMap.put(8, "LXXX");
        this.decimalArabicToRomanNumeralsMap.put(9, "XC");
        this.decimalArabicToRomanNumeralsMap.put(10, "C");
    }

    /**
     * Checks if param - arabic numeral
     * @param numeralString
     * @return true - if param - arabic numeral
     *         false - otherwise
     */
    public boolean isCorrectArabicNumeral(String numeralString) {
        boolean result = true;
        try {
            int numeral = Integer.parseInt(numeralString);
            if (numeral < 1 || numeral > 10) {
                result = false;
            }
        } catch(Exception ex) {
            result = false;
        }

        return result;
    }

    /**
     * Checks if param - Roman numeral
     * @param numeralString
     * @return true - if param - Roman numeral
     *         false - otherwise
     */
    public boolean isCorrectRomanNumeral(String numeralString) {
        boolean result = true;
        if (!this.romanToArabicNumeralsMap.containsKey(numeralString)) {
            result = false;
        }

        return result;
    }

    /**
     * Checks if param - Roman
     * or Arabic numeral
     * @param numeralString
     * @return true - if param - numeral
     *         false - otherwise
     */
    public boolean isCorrectNumeral(String numeralString) {
        return this.isCorrectArabicNumeral(numeralString) ||
               this.isCorrectRomanNumeral(numeralString);
    }

    /**
     * Method correctly transfer
     * Arabic number from 1 to 100
     * into Rome numeral
     * @param arabicNumber
     * @return representation of param
     * in Rome numerals
     */
    public String changeArabicToRome(int arabicNumber) {
        String result = "";
        if (arabicNumber >= 1 && arabicNumber <= 10) {
            result = this.arabicToRomanNumeralsMap.get(arabicNumber);
        } else {
            int decimalPart = arabicNumber / 10;
            int singlePart = arabicNumber % 10;
            result = this.decimalArabicToRomanNumeralsMap.get(decimalPart) +
                     this.arabicToRomanNumeralsMap.get(singlePart);
        }

        return result;
    }

    /**
     * Method correctly trasfer
     * Rome number from I to X
     * into Arabic numeral
     * @param romeNumber
     * @return representation of param
     *         in Arabic numerals
     */
    public int changeRomeToArabic(String romeNumber) {
        return this.romanToArabicNumeralsMap.get(romeNumber);
    }
}
