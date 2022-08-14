public class MergeSort {
    public  void merge(int [] array){
        if(array.length > 2){
            int midIndex = array.length / 2;

            int [] leftHand = new int[midIndex];
            int [] rightHand = new int[array.length - midIndex];

            for (int i = 0; i < midIndex; i++){
                leftHand[i] = array[i];
            }
            for(int i = midIndex; i < array.length; i++){
                rightHand[i - midIndex] = array[i];
            }
            merge(leftHand);
            merge(rightHand);
            mergeSortedArrays(array, leftHand, rightHand);
        }

    }
    public void mergeSortedArrays(int [] array, int[] leftHand, int[] rightHand){
        int k = 0;
        int j = 0;
        int i = 0;
        while (k < leftHand.length && rightHand.length > j){
            if(leftHand[k] >= rightHand[j]){
                array[i] = rightHand[j];
                j++;
            }else{
                array[i] = leftHand[k];
                k++;
            }
            i++;
        }
        while (k < leftHand.length ){
            array[i] = leftHand[k];
            i++;
            k++;
        }
        while (j < rightHand.length){
            array[i] = rightHand[j];
            j++;
            i++;
        }
    }
}