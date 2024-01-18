import java.util.Arrays;

public class k {
    public static void main(String[] args) {


        int[] arr = new int[]{5,7,2,4};
        for(int i = 1; i < arr.length;i++){

            int key = arr[i];
            int currentIndex = i - 1;

            while(currentIndex >= 0 && key < arr[currentIndex]){
                arr[currentIndex + 1] = arr[currentIndex];
                currentIndex--;
            }

            arr[currentIndex + 1] = key;
    

        }
        System.out.println(Arrays.toString(arr));
    }

    
}
