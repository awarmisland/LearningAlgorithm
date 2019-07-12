import java.util.Arrays;

/**
 * 冒泡算法
 * 时间复杂度 n(n+1)/2 = O(n^2)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,1,4,23,9,0,12,29,5,2,6,8,14};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("BubbleSort："+Arrays.toString(arr));
    }
}
