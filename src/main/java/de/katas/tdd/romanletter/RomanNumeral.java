package de.katas.tdd.romanletter;

public enum RomanNumeral {
    I(RomanLetter.I.decimalValue()),
    IV(RomanLetter.V.decimalValue() - RomanLetter.I.decimalValue()),
    V(RomanLetter.V.decimalValue()),
    IX(RomanLetter.X.decimalValue() - RomanLetter.I.decimalValue()),
    X(RomanLetter.X.decimalValue()),
    XL(RomanLetter.L.decimalValue() - RomanLetter.X.decimalValue()),
    L(RomanLetter.L.decimalValue()),
    XC(RomanLetter.C.decimalValue() - RomanLetter.X.decimalValue()),
    C(RomanLetter.C.decimalValue()),
    CD(RomanLetter.D.decimalValue() - RomanLetter.C.decimalValue()),
    D(RomanLetter.D.decimalValue()),
    CM(RomanLetter.M.decimalValue() - RomanLetter.C.decimalValue()),
    M(RomanLetter.M.decimalValue());

    private final int decimalValue;

    RomanNumeral(int decimalValue) {
        this.decimalValue = decimalValue;
    }

    public int decimalValue() {
        return decimalValue;
    }

    public static int convertRomanNumeral(String romanNumeral) {
        if (romanNumeral.equals("I")) {
            return I.decimalValue();
        }
        if (romanNumeral.equals("IV")) {
            return IV.decimalValue();
        }
        if (romanNumeral.equals("V")) {
            return V.decimalValue();
        }
        if (romanNumeral.equals("IX")) {
            return IX.decimalValue();
        }
        if (romanNumeral.equals("X")) {
            return X.decimalValue();
        }
        if (romanNumeral.equals("XL")) {
            return XL.decimalValue();
        }
        if (romanNumeral.equals("L")) {
            return L.decimalValue();
        }
        if (romanNumeral.equals("XC")) {
            return XC.decimalValue();
        }
        if (romanNumeral.equals("C")) {
            return C.decimalValue();
        }
        if (romanNumeral.equals("CD")) {
            return CD.decimalValue();
        }
        if (romanNumeral.equals("D")) {
            return D.decimalValue();
        }
        if (romanNumeral.equals("CM")) {
            return CM.decimalValue();
        }
        if (romanNumeral.equals("M")) {
            return M.decimalValue();
        }

        return 0;
    }
}
