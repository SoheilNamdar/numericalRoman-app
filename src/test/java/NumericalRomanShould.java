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
        assertEquals("I", numericalRomain.convert(1));
    }

    @Test
    public void convert_2_to_II() {
        assertEquals("II", numericalRomain.convert(2));
    }

    @Test
    public void convert_3_to_III() {
        assertEquals("III", numericalRomain.convert(3));
    }

    @Test
    public void convert_6_to_VI() {
        assertEquals( "VI", numericalRomain.convert(6));
    }

    @Test
    public void convert_7_to_VII() {
        assertEquals("VII", numericalRomain.convert(7));
    }

    @Test
    public void convert_8_to_VIII() {
        assertEquals("VIII", numericalRomain.convert(8));
    }
}
