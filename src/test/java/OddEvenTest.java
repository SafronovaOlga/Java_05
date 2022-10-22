import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    /**
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     */

    @Test
    public void testOddEvenHappyPathNeg () {

        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEvenAlgorithm = new OddEven();
        String actualResult = oddEvenAlgorithm.oddEven(number);

       Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testOddEvenHappyPathZero () {

        int number = 0;
        String expectedResult = "Even";

        OddEven oddEvenAlgorithm = new OddEven();
        String actualResult = oddEvenAlgorithm.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenHappyPath () {

        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEvenAlgorithm = new OddEven();
        String actualResult = oddEvenAlgorithm.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testOddEvenPositive () {

       int number = Integer.MIN_VALUE + 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);

    }

}
