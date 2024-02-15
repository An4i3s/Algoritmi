import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort iSort = new InsertionSort();
        int[] ints = {1,5,2,300,87, 04};
        int[] sortedInts = iSort.insertionSort(ints);
        System.out.println(Arrays.toString(sortedInts));
        iSort.reversedInsertionSort(ints);
        iSort.calculateExeTime(ints);

        System.out.println("*".repeat(30));

        MergeSort mSort = new MergeSort();
        int n = ints.length;
        //mSort.mergeSort(sortedInts, n);

        System.out.println("*".repeat(30));
        SelectionSort sSort = new SelectionSort();
        sSort.selectionSort(ints);
    }
}