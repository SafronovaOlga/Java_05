public class BiggerValue {
    /**
     *  Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     *
     */

    public int getBiggerValue (int number1, int number2) {

        if (number1 > number2) {
            return number1;
        } else if ( number1 < number2){
            return number2;
        } else {
            return 0;
        }

    }
}
