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
}
