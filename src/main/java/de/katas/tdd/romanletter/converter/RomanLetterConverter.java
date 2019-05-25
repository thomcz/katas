package de.katas.tdd.romanletter.converter;

import de.katas.tdd.romanletter.RomanNumeral;
import de.katas.tdd.romanletter.util.CharacterUtil;

public class RomanLetterConverter {
    public int convertRomanNumerals(String romanNumeral) {
        String romanNumeralWithoutWhitespace = romanNumeral.replaceAll(" ", "");
        int romanNumeralAsDecimal = 0;

        for (int i = 0; i < romanNumeralWithoutWhitespace.length(); i++) {
            int valueOfOneLetter = convertRomanNumeral(romanNumeralWithoutWhitespace.charAt(i));
            int valueOfTwoLetters = 0;
            if (i + 1 <= romanNumeralWithoutWhitespace.length() - 1) {
                String twoRomanLetters = CharacterUtil.concatCharacters(romanNumeralWithoutWhitespace.charAt(i), romanNumeralWithoutWhitespace.charAt(i + 1));
                valueOfTwoLetters = convertRomanNumeral(twoRomanLetters);
            }
            if (valueOfOneLetter > valueOfTwoLetters) {
                romanNumeralAsDecimal += valueOfOneLetter;
                continue;
            }
            romanNumeralAsDecimal += valueOfTwoLetters;
            i++;
        }

        return romanNumeralAsDecimal;
    }


    private int convertRomanNumeral(Character romanLetter) {
        return RomanNumeral.convertRomanNumeral(String.valueOf(romanLetter));
    }

    public int convertRomanNumeral(String romanLetter) {
        return RomanNumeral.convertRomanNumeral(romanLetter);
    }
}
