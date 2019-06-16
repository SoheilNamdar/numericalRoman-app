import model.NumericalRomain;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumericalRomanShould {

    private NumericalRomain numericalRomain;

    @Before
    public void setUp() {
        numericalRomain = new NumericalRomain();
    }

    @Test
    public void convert_1_to_I() {
        assertEquals("I", numericalRomain.romanFor(1));
    }

    @Test
    public void convert_2_to_II() {
        assertEquals("II", numericalRomain.romanFor(2));
    }

    @Test
    public void convert_3_to_III() {
        assertEquals("III", numericalRomain.romanFor(3));
    }

    @Test
    public void convert_6_to_VI() {
        assertEquals( "VI", numericalRomain.romanFor(6));
    }

    @Test
    public void convert_7_to_VII() {
        assertEquals("VII", numericalRomain.romanFor(7));
    }

    @Test
    public void convert_8_to_VIII() {
        assertEquals("VIII", numericalRomain.romanFor(8));
    }

    @Test
    public void convert_11_to_XI() {
        assertEquals("XI", numericalRomain.romanFor(11));
    }

    @Test
    public void convert_12_to_XII() {
        assertEquals("XII", numericalRomain.romanFor(12));
    }

    @Test
    public void convert_13_to_XIII() {
        assertEquals("XIII", numericalRomain.romanFor(13));
    }

    @Test
    public void convert_17_to_XVII() { assertEquals("XVII", numericalRomain.romanFor(17));
    }

    @Test
    public void convert_17_to_XXI() { assertEquals("XXI", numericalRomain.romanFor(21));
    }

    @Test
    public void convert_37_to_XXXVII() { assertEquals("XXXVII", numericalRomain.romanFor(37));
    }
}
