import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Permutation {

    static boolean isPermutable(String a, String b) {

        if (a.length() != b.length())
            return false;

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        return Arrays.equals(charA, charB);

    }

    static boolean isPermutationOfPalindrome(String str) {
        str = str.replace(" ", "").toLowerCase();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        boolean oddCountAllowed = true;

        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                if (oddCountAllowed) {
                    oddCountAllowed = false;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}
