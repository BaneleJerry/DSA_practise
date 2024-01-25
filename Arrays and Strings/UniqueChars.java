

public class UniqueChars {
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
}
