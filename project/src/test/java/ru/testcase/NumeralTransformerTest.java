package ru.testcase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumeralTransformerTest {

    @Test
    public void isCorrectArabicNumeral() {
        NumeralTransformer transformer = new NumeralTransformer();
        Assert.assertEquals(transformer.isCorrectArabicNumeral("11"), false);
    }

    @Test
    public void isCorrectRomanNumeral() {
        NumeralTransformer transformer = new NumeralTransformer();
        Assert.assertEquals(transformer.isCorrectRomanNumeral("VII"), true);
    }

    @Test
    public void changeArabicToRome() {
        NumeralTransformer transformer = new NumeralTransformer();
        Assert.assertEquals(transformer.changeArabicToRome(9), "IX");
    }

    @Test
    public void changeRomeToArabic() {
        NumeralTransformer transformer = new NumeralTransformer();
        Assert.assertEquals(transformer.changeRomeToArabic("VIII"), 8);
    }
}