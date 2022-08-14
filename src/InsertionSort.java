import java.util.ArrayList;

public class InsertionSort {
    public int[] array;
    public InsertionSort(int[] array) {
            this.array = array;
    }
    public int[] insertionSort(){
        for (int i = 1; i < array.length; i++){
          int hole = i;
          int holeValue = array[hole];
          while (hole > 0 && holeValue  < array[hole-1] ){
              array[hole] = array[hole-1];
              hole-= 1;
          }
          array[hole] = holeValue;
        }
        return array;
    }
}
