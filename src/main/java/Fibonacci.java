public class Fibonacci {
    /*
    * Class that provides a method to compute the fibonacci number given a number
    * */

    public int compute(int numero){
        int result;

        if (numero < 0){
            throw new RuntimeException("Negative numbers cannot be computed.");
        }

        if (numero == 0){
            result = 0;
        } else if (numero == 1){
            result = 1;
        } else {
            result = compute(numero-1) + compute(numero-2);
        }

        return result;
    }
}
