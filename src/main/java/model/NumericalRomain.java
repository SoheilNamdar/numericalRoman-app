package model;

public class NumericalRomain {

    public String convert(int arabicNumber) {
        String romanNumber = "";

        if (arabicNumber > 10 ) {
            romanNumber += "X";
            arabicNumber -= 10;
        }

        if (arabicNumber > 5 ) {
            romanNumber += "V";
            arabicNumber -= 5;
        }

        for (int i = 0 ; i < arabicNumber ; i++) {
            romanNumber += "I";
        }

        return romanNumber;
    }


}

