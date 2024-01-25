

public class CharacterReplacement {
    
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
}
