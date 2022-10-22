package project_utils;

public class Utils {
  public static boolean checkForEmptyNullArray(int[] array) {
      if (array != null && array.length != 0) {

          return true;
      } else {

          return false;
      }
  }

    public static boolean checkForEmptyNullArray(String[] array) {
        if (array != null && array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean checkForEmptyNullArray(double[] array) {
        if (array != null && array.length != 0) {

            return true;
        } else {

            return false;
        }
    }

    public static int[] getMinMaxAverageArray(int[] array) {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
     // int average;
      int sum = 0;

      for(int i = 0; i < array.length; i++) {
          if (array[i] < min) {
              min = array[i];
          }
          if (array[i] > max) {
              max = array[i];
          }
          sum += array[i];
      }

     // average = sum / array.length;
        return new int[]{min, max, (sum / array.length)};
    }

}
