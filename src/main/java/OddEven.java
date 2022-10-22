public class OddEven {
    public String oddEven (int number) {
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (number == Integer.MAX_VALUE && number == Integer.MIN_VALUE) {
            if (number < Integer.MAX_VALUE && number > Integer.MIN_VALUE) {
                if (number % 2 == 0) {

                    return even;
                }
                else {

                    return odd;
                }
            }

        }
        return undefined;


    }
}
