import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    @Test
    public void testHappePath (){
        int start = 1;
        int end = 1;

        String[] expectedResult = {"1"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
