import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {
    Bird bird1 = new Bird("cardinal");
    Bird bird2 = new Bird("finch");
    Bird bird3 = new Bird("finch");
    @Test
    public void testAddition(){
        int input1 = 6;
        int input2 = 8;
        int expectedResult = 14;
        Assert.assertEquals(expectedResult, Calculator.add(input1, input2));
    }

    @Test
    public void testTipCalculator(){
        double cost = 22.56;
        double tipPercentage = 15;
        double tip = 3.38;
        Assert.assertEquals(tip, Calculator.calculateTip(cost, tipPercentage), 0.01);
    }

    @Test
    public void testSameObjects(){
        Assert.assertNotSame(bird1, bird2);
    }
}
