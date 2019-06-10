import model.NumericalRomain;
import org.junit.Assert;
import org.junit.Test;

public class NumericalRomanShould {
    @Test
    public void convert_1_to_I() {
        Assert.assertEquals("I", new NumericalRomain().convert(1));
    }

    @Test
    public void convert_2_to_II() {
        Assert.assertEquals("II", new NumericalRomain().convert(2));
    }

    @Test
    public void convert_3_to_III() {
        Assert.assertEquals("III", new NumericalRomain().convert(3));
    }
}
