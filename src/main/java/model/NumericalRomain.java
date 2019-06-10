package model;

public class NumericalRomain {
    private String romanNumber = "";

    public String convert(int arabicNumber){
        for (int i = 0 ; i < arabicNumber ; i++) {
            romanNumber += "I";
        }
        return romanNumber;
    }
}
