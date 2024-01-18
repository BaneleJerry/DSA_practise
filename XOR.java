public class XOR {
    public static void main(String[] args) {
        
        System.out.println(sort("anagram"));
        System.out.println(sort("nagaram"));
    }

    private static String sort(String a) {

        char[] cArr = a.toCharArray();
        int n = cArr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (cArr[j] > cArr[j + 1]) {
                    char tmp = cArr[j];
                    cArr[j ] = cArr[j];
                    cArr[j] = tmp;
                }
            }
        }


        return String.valueOf(cArr);
    }


}