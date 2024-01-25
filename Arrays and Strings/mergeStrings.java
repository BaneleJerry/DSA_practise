import java.util.ArrayList;

public class mergeStrings {

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

}