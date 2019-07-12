import java.util.Arrays;

/**
 * 选择性排序
 * 时间复杂度 n(n+1)/2 =O(n^2）
 */
public class SelectiveSort {

    public static void main(String[] args) {
        int[] arr = {3,1,4,23,9,0,12,29,5,2,6,8,14};

        for(int i=0;i<arr.length;i++){
            int tmp = arr[i];
            int min_index = i;

            for(int j=i;j<arr.length;j++){
                if(tmp>arr[j]){
                    tmp = arr[j];
                    min_index = j;
                }
            }
            arr[min_index] = arr[i];
            arr[i] = tmp;
        }

        System.out.println("SelectiveSort："+Arrays.toString(arr));
    }
}
