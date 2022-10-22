import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
    /**
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    @Test
    public void  testOddIndicesHappyPath (){
        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult =  {590, 985, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.getOddIndicesArray(input);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testOddIndicesArrayOfOne () {
        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().getOddIndicesArray(array);

        Assert.assertEquals(actualResult, expectedResult );
    }

    @Test
    public void testOddIndicesArrayOfNull () {
        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().getOddIndicesArray(array);

        Assert.assertEquals(actualResult, expectedResult );
    }

    @Test
    public void testOddIndicesArrayOfEmpty () {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().getOddIndicesArray(array);

        Assert.assertEquals(actualResult, expectedResult );
    }
}
