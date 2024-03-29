public class InsertionSort {


    public int[] insertionSort(int[] array){

        for (int j = 1; j< array.length;j++){//j= 1; //j=2
            int key = array[j]; //key= "2" //key= "4"
            int i = j-1;//i = 0 //i = 1
            while ((i>=0) && (array[i]>=key)){ //(1>0) & (array[0] ==5 > 2 // & (array[1] ==5 > 4
                array[i+1] = array[i]; //array[1] = array[0] ->5 is second place //array[2] = array[1] ->4 is second place, 5 is third place
                i = i-1; //-1
            }
            array[i+1] = key;
        }
        return array;
    }

    public  void reversedInsertionSort(int[] array){

        for (int j = 1; j< array.length;j++){
            int key = array[j];
            int i = j-1;
            while ((i>=0) && (array[i]<=key)){
                array[i+1] = array[i];
                i = i-1;
            }
            array[i+1] = key;
        }
    }

    public  void calculateExeTime(int[] array){
        int sizeOfArray = array.length;
        int insertionSortAlgo = sizeOfArray*sizeOfArray;
        System.out.println("The Number of steps for ordering an array of "+sizeOfArray+" elements with insertion sort is: "+insertionSortAlgo);
    }
}

