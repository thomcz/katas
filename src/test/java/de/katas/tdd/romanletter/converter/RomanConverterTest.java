package de.katas.tdd.romanletter.converter;

import de.katas.tdd.romanletter.RomanLetter;
import de.katas.tdd.romanletter.RomanNumeral;
import de.katas.tdd.romanletter.constants.RomanNumeralConstants;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanConverterTest {
    private RomanLetterConverter romanLetterConverter;

    @Before
    public void setUp() {
        romanLetterConverter = new RomanLetterConverter();
    }

    @Test
    public void letterITest() {
        String romanLetterI = "I";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanLetterI);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.I.decimalValue());
    }

    @Test
    public void numeralIVTest() {
        String romanNumeralIV = "IV";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanNumeralIV);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.V.decimalValue() - RomanLetter.I.decimalValue());
    }

    @Test
    public void letterVTest() {
        String romanLetterV = "V";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanLetterV);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.V.decimalValue());
    }

    @Test
    public void numeralIXTest() {
        String romanNumeralIX = "IX";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanNumeralIX);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.X.decimalValue() - RomanLetter.I.decimalValue());
    }

    @Test
    public void letterXTest() {
        String romanLetterX = "X";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanLetterX);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.X.decimalValue());
    }

    @Test
    public void numeralXLTest() {
        String romanNumeralXL = "XL";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanNumeralXL);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.L.decimalValue() - RomanLetter.X.decimalValue());
    }

    @Test
    public void letterLTest() {
        String romanLetterL = "L";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanLetterL);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.L.decimalValue());
    }

    @Test
    public void numeralXCTest() {
        String romanNumeralXC = "XC";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanNumeralXC);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.C.decimalValue() - RomanLetter.X.decimalValue());
    }

    @Test
    public void letterCTest() {
        String romanLetterC = "C";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanLetterC);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.C.decimalValue());
    }

    @Test
    public void numeralCDTest() {
        String romanNumeralCD = "CD";
        int convertedRomanLetter = RomanNumeral.convertRomanNumeral(romanNumeralCD);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.D.decimalValue() - RomanLetter.C.decimalValue());
    }

    @Test
    public void letterDTest() {
        String romanLetterD = "D";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanLetterD);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.D.decimalValue());
    }

    @Test
    public void numeralCMTest() {
        String romanNumeralCM = "CM";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanNumeralCM);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.M.decimalValue() - RomanLetter.C.decimalValue());
    }

    @Test
    public void letterMTest() {
        String romanLetterM = "M";
        int convertedRomanLetter = romanLetterConverter.convertRomanNumeral(romanLetterM);
        assertThat(convertedRomanLetter).isEqualTo(RomanLetter.M.decimalValue());
    }

    @Test
    public void romanNumeral9Test() {
        String romanNumeral = RomanNumeralConstants.NINE.getValue();
        int convertedRomanLetters = romanLetterConverter.convertRomanNumerals(romanNumeral);
        assertThat(convertedRomanLetters).isEqualTo(RomanNumeralConstants.NINE.getKey());
    }

    @Test
    public void romanNumeral42Test() {
        String romanNumeral = RomanNumeralConstants.FOURTY_TWO.getValue();
        int convertedRomanLetters = romanLetterConverter.convertRomanNumerals(romanNumeral);
        assertThat(convertedRomanLetters).isEqualTo(RomanNumeralConstants.FOURTY_TWO.getKey());
    }

    @Test
    public void romanNumeral99Test() {
        String romanNumeral = RomanNumeralConstants.NINETY_NINE.getValue();
        int convertedRomanLetters = romanLetterConverter.convertRomanNumerals(romanNumeral);
        assertThat(convertedRomanLetters).isEqualTo(RomanNumeralConstants.NINETY_NINE.getKey());
    }

    @Test
    public void romanNumeral1984Test() {
        String romanNumeral = RomanNumeralConstants.NINETEEN_EIGHTY_FOUR.getValue();
        int convertedRomanLetters = romanLetterConverter.convertRomanNumerals(romanNumeral);
        assertThat(convertedRomanLetters).isEqualTo(RomanNumeralConstants.NINETEEN_EIGHTY_FOUR.getKey());
    }

    @Test
    public void romanNumeral2013Test() {
        String romanNumeral = RomanNumeralConstants.TWO_THOUSEND_THIRTEEN.getValue();
        int convertedRomanLetters = romanLetterConverter.convertRomanNumerals(romanNumeral);
        assertThat(convertedRomanLetters).isEqualTo(RomanNumeralConstants.TWO_THOUSEND_THIRTEEN.getKey());
    }

    @Test
    public void romanNumeralSpaceTest() {
        String romanNumeral = RomanNumeralConstants.SPACE.getValue();
        int convertedRomanLetters = romanLetterConverter.convertRomanNumerals(romanNumeral);
        assertThat(convertedRomanLetters).isEqualTo(RomanNumeralConstants.SPACE.getKey());
    }
}


