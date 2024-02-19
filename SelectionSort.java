import java.util.Arrays;

public class SelectionSort {
      
    public  void selectionSort(int[] ints){


        for (int i = 0; i<ints.length-1; i++){
            //Partiamo dall' i-esimo elemento
               int minValue = i;

                for (int j = i+1; j<ints.length; j++){
                    //Ogni volta che nell’iterazione troviamo un elemento piú
                    //piccolo di minimo facciamo puntare minimo all’elemento trovato
                        if (ints[minValue] > ints[j]){
                            minValue = j;
                        }
                    }

                //Se minimo e diverso dall' elemento di partenza
                //allora avviene lo scambio
            if (minValue != i){
                int k = ints[minValue];
                ints[minValue] = ints[i];
                ints[i] = k;
                    }

                }

        System.out.println(Arrays.toString(ints));
    }
}
