package model;

public class NumericalRomain {

    public String romanFor(int decimal){
        String roman = "";

        /*for(RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
            while (decimal >= romanToDecimal.decimal) {
                roman += romanToDecimal.roman ;
                decimal -= romanToDecimal.decimal;
            }
        }*/
        while (decimal>10) {
            roman += "X";
            decimal -= 10;
        }

        if( decimal > 5) {
            roman += "V";
            decimal -= 5;
        }

        for(int i=0 ; i<decimal ; i++) {
                roman += "I";
        }
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

