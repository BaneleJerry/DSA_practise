package Sorting;
public class QuickSort {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] charS = s.toCharArray();
            char[] charT = t.toCharArray();
            s = qsort(charS, 0, charS.length - 1);
            t = qsort(charT, 0, charT.length - 1);

            if (s.equals(t))
                return true;
            else
                return false;
        }
    }

    private static String qsort(char[] cArr, int lo, int hi) {
        if (lo >= hi) {
            new String(cArr, lo, hi - lo + 1);
        } else {
            int pIdx = partition(cArr, lo, hi);
            qsort(cArr, lo, pIdx - 1);
            qsort(cArr, pIdx + 1, hi);
        }

        return String.valueOf(cArr);
    }

    private static int partition(char[] cArr, int lo, int hi) {
        char p = cArr[hi];
        int idx = lo - 1;

        for (int i = lo; i < hi; i++) {
            if (cArr[i] <= p) {
                idx++;
                char tmp = cArr[i];
                cArr[i] = cArr[idx];
                cArr[idx] = tmp;
            }
        }

        idx++;
        cArr[hi] = cArr[idx];
        cArr[idx] = p;

        return idx;
    }
}