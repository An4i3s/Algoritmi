import java.util.Arrays;

public class MergeSort {

    public  void mergeSort(int[] array, int n) {
        //n = array.lenght
        System.out.println(Arrays.toString(array));

       if (n<=1){
           return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];


        for(int i=0;i<mid;i++){
            left[i]=array[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid]=array[i];
        }

        mergeSort(left,mid);
        mergeSort(right, n-mid);
        merge(left,right,array);
    }


    public  void merge(int left[], int right[], int array[]) {

        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0;

        int k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
                k++;
            } else {
                array[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < leftSize) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(array));

    }

    public void calculateExeTime(){
        //Therefore the time complexity is O(N * log2N).

    }
}
