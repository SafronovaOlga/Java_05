import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OddIndicesTest {
    /**
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    @Test
    public void  testOddIndicesHappyPath (){
        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult =  {590, 985, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.getOddIndicesArray(arr);

//        System.out.println(Arrays.toString(expectedResult));
//        System.out.println(Arrays.toString(actualResult));

       // Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
