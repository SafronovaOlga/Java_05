import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    /**
     *      Test Data:
     *      3333, 9999
     *      Expected Result = 9999
     */
    @Test

    public void testBiggerValueHappyPath () {

        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = number2;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(number1,number2);

        Assert.assertEquals(expectedResult,actualResult);

    }

}
