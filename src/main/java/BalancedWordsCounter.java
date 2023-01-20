import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BalancedWordsCounter {

    public static int count(String word) {
        // null check
        if (word == null) {
            throw new RuntimeException("Input is null");
        }
        // non-letters symbols check
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch < 'A' || ('Z' < ch && ch < 'a') || ch > 'z') {
                throw new RuntimeException("Word contains non-letters symbols");
            }
        }
        // time: O(word.length^2) space: constant
        int counter = 0;
        int[] occurrences = new int[57];
        for (int i = 0; i < word.length(); i++) {
            Arrays.fill(occurrences, 0);

            for (int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);
                occurrences[ch - 'A'] ++;
                int balanceNumber = occurrences[ch - 'A'];
                boolean isBalanced = true;
                for (int letterOcc: occurrences) {
                    if (letterOcc != 0 && letterOcc != balanceNumber) {
                        isBalanced = false;
                        break;
                    }
                }
                if (isBalanced) {
                    counter ++;
                }
            }
        }
        return counter;
    }
}
