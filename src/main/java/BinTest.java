

import org.junit.Assert;
import org.junit.Test;

public class BinTest {

   @Test
    public void testBinEmpty() {
        Bins newBin = new Bins(2,12);

        Integer actual = newBin.getBin(2);
        Integer expected = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBinOne() {
        Bins newBin = new Bins(2,12);
        newBin.incrementBin(7);

        Integer actual = newBin.getBin(7);
        Integer expected = 1;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBinTwo() {
        Bins newBin = new Bins(2,12);
        newBin.incrementBin(10);
        newBin.incrementBin(10);

        Integer actual = newBin.getBin(10);
        Integer expected = 2;

        Assert.assertEquals(expected,actual);
    }
}
