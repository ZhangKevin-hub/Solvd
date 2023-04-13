import java.util.Arrays;
import java.util.Random;

public class Sorts {
    public static int[] randomize(){
        int[] randomarr = new int[10];
        Random random = new Random();
        for( int i = 0; i < randomarr.length; i++){
            randomarr[i] = random.nextInt(100);
        }
        return randomarr;
    }
    public static void main(String[] args) {
        int[] arr = randomize();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr) {
        if(arr.length < 2){
            return arr;
        }
        // deal with separations
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for(int i =0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < arr.length;i++){
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        // merge
        return merge(arr, left, right);
    }
    public static int[] merge(int[] arr, int[] left, int[] right){
        int leftS = left.length;
        int rightS = right.length;

        int i = 0, j =0, k = 0;
        while(i < leftS && j < rightS){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while( i < leftS){
            arr[k]= left[i];
            i++;
            k++;
        }
        while( j < rightS){
            arr[k]= right[j];
            j++;
            k++;
        }
        return arr;
        
    }
}
