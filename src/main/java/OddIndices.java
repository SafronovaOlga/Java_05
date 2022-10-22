public class OddIndices {

    /**
     * Написать алгоритм OddIndices,
     * который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
     */

    public int[] getOddIndicesArray (int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i <= array.length; i++) {
           if (array[i] % 2 != 0) {

             return new int[]{i};
           }
        }
        return result;
    }

}
