package model;

public class NumericalRomain {

    public String romanFor(int decimal){
        String roman = "";


        while (decimal >= 10) {
            roman += "X";
            decimal -= 10;
        }

        while ( decimal >= 5) {
            roman += "V";
            decimal -= 5;
        }

        while ( decimal >= 1) {
            roman += "I";
            decimal -= 1;
        }

       /* for(int i=0 ; i<decimal ; i++) {
                roman += "I";
        }*/
        return roman;
    }

    enum RomanToDecimal {
        Five(5, "V"),
        Ten(10, "X");


        public final int decimal;
        public final String roman;

        RomanToDecimal(int decimal, String roman) {
            this.decimal = decimal;
            this.roman = roman;
        }
    }

}

