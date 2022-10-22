import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {
    /**
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */
    @Test
    public void testSumArrayHappyPath() {

    int[] array = {-7, -3};
    int expectedResult = -10;

    SumArray sumArray = new SumArray();
    int actualResult = sumArray.getSumArray(array);

        Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testSumArrayHappyPath1() {

      int[] array = {0, 1, 2, 3, 4, 5};
      int expectedResult = 15;

      SumArray sumArray = new SumArray();
      int actualResult = sumArray.getSumArray(array);

      Assert.assertEquals(expectedResult, actualResult);
  }

    @Test
    public void testSumArrayWithNegativeNumber () {

        int[] array = new int[] {0, -2, 452};
        int expectedResult = 450;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);

        Assert.assertEquals(expectedResult,actualResult);

    }
}
