package model;

public class NumericalRomain {

    public String romanFor(int decimal){
        String roman = "";

        for (RomanToDecimal value : RomanToDecimal.values()) {
           while (decimal >= value.decimal) {
                roman += value.roman;
                decimal -= value.decimal;
            }
        }
        return roman;
    }

    enum RomanToDecimal {
        Thousand(1000, "M"),
        NineHundred(900, "CM"),
        FiveHundred(500, "D"),
        FourHundred(400,"CD"),
        Hundred(100,"C"),
        Ninety(90,"XC"),
        Fifty(50,"L"),
        Fourty(40, "XL"),
        Ten(10, "X"),
        Nine(9, "IX"),
        Five(5, "V"),
        Four(4, "IV"),
        One(1,"I");

        public final int decimal;
        public final String roman;

        RomanToDecimal(int decimal, String roman) {
            this.decimal = decimal;
            this.roman = roman;
        }
    }

}

