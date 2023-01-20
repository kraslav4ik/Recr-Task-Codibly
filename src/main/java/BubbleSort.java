import java.util.Arrays;

public class BubbleSort {

    public static Number[] sort(Number[] input) {
        // null check
        if (input == null) {
            throw new RuntimeException("Input is null");
        }

        // time: O(input.length^2) space: const
        int nullCounter = 0;
        for (int i = 0; i < input.length - 1; i ++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] == null) {
                    nullCounter++;
                }
                if (compareNumbers(input[j], input[j + 1]) > 0) {
                    Number tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
        return Arrays.copyOf(input, input.length - nullCounter);
    }

    private static int compareNumbers(Number n1, Number n2) {
        if (n1 == null) {
            return 1;
        }
        if (n2 == null) {
            return -1;
        }
        Double n2c = n2.doubleValue();
        Double n1c = n1.doubleValue();

        return n1c.compareTo(n2c);
    }
}

