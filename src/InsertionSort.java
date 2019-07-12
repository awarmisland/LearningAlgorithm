import java.util.Arrays;

/**
 *  插入排序
 *  n(n-1)/2 = O(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3,12,1,9,2,39,0,8,6,13,15,4};
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<i+1;j++){
                if(arr[i] < arr[j] ){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("InsertionSort："+ Arrays.toString(arr));
    }
}
