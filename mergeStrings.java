import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class mergeStrings {

    public static void main(String[] args) {

        System.out.println(isPermutationOfPalindrome("Banele Thabede"));

    }

    static ArrayList<String> mergestrings(String[] a, String[] b) {

        ArrayList<String> sentence = new ArrayList<>();

        int max = (a.length > b.length) ? a.length : b.length;

        for (int i = 0; i < max; i++) {
            if (i < a.length) {
                sentence.add(a[i]);
            }

            if (i < b.length) {
                sentence.add(b[i]);
            }
        }

        return sentence;
    }

    static boolean hasUniqueChars(String s) {

        if (s.length() > 128)
            return false; // Check

        boolean[] charSet = new boolean[128];

        for (int i = 0; i < s.length(); i++) {

            int val = s.charAt(i);
            if (charSet[val]) {
                return false;
            }

            charSet[val] = true;
        }
        return true;
    }

    static boolean isPermutable(String a, String b) {

        if (a.length() != b.length())
            return false;

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        return Arrays.equals(charA, charB);

    }

    static String URLifyString(String a) {

        char[] charArry = a.toCharArray();
        StringBuilder s = new StringBuilder();

        for (char c : charArry) {
            if (c == ' ')
                s.append("20%");
            else
                s.append(c);
        }

        return s.toString();

    }

    static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index = 0;

        // Count spaces
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;

        // Ensure the array is not exceeded
        if (trueLength < str.length) {
            str[trueLength] = '\0';
        }

        // Replace spaces in reverse order
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
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