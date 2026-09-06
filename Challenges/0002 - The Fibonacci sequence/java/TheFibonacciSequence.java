public class TheFibonacciSequence {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static long fibonacci(int index) {
        if (index <= 0) {
            return 0;
        }

        long value1 = 0;
        long value2 = 1;

        for (int i = 1; i < index; i++) {
            long temp = value1 + value2;
            value1 = value2;
            value2 = temp;
        }

        return value2;
    }
}