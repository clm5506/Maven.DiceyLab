
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testTossAndSum3() {

        Dice testDice = new Dice(3);

        Integer actual = testDice.tossAndSum();

        Assert.assertTrue(actual >= 3);
        Assert.assertTrue(actual <= (3*6));
    }

    @Test
    public void testTossAndSum2() {
        Dice testDice = new Dice(5);

        Integer actual = testDice.tossAndSum();

        Assert.assertTrue(actual >= 5);
        Assert.assertTrue(actual <= (5*6));
    }
}
