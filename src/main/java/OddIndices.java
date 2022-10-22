import project_utils.Utils;

public class OddIndices {

    /**
     * Написать алгоритм OddIndices,
     * который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
     */

    public int[] getOddIndicesArray(int[] arr) {
        if (Utils.checkForEmptyNullArray(arr)) {

            int k = 0;
            int[] newArr = new int[arr.length / 2];


            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    newArr[k] = arr[i];
                    k++;
                }

            }
            return newArr;

        }
        return new int[]{};

    }
}