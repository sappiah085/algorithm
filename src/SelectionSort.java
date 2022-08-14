public class SelectionSort {
    public int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int imin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[imin]) {
                    imin = j;
                }
            }
            int temp = array[imin];
            array[imin] = array[i];
            array[i] = temp;
        }
        return array;
    }


}