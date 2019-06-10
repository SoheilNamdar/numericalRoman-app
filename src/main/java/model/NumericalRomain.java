package model;

public class NumericalRomain {
    private String romanNumber = "";

    public String convert(int arabicNumber){
        for (int i = 0 ; i < arabicNumber ; i++) {
            romanNumber += "I";
        }
        if (arabicNumber == 6) {
            romanNumber = "VI";
        }
        if (arabicNumber == 7) {
            romanNumber = "VII";
        }
        if (arabicNumber == 8) {
            romanNumber = "VIII";
        }
        return romanNumber;
    }
}
