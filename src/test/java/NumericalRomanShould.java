import model.NumericalRomain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumericalRomanShould {

    private NumericalRomain numericalRomain;

    @Before
    public void setUp() {
        numericalRomain = new NumericalRomain();
    }

    @Test
    public void convert_1_to_I() {
        Assert.assertEquals("I", numericalRomain.convert(1));
    }

    @Test
    public void convert_2_to_II() {
        Assert.assertEquals("II", numericalRomain.convert(2));
    }

    @Test
    public void convert_3_to_III() {
        Assert.assertEquals("III", numericalRomain.convert(3));
    }
}
