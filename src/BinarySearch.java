public class BinarySearch {
    int[] array;
    public BinarySearch(int[] array){
        this.array = array;
    }
    public int binarySearch(int key, int low, int high){
        int mid =  low + (high - low)/2;
       if(high >= low){
           if(array[mid] == key){
               return mid;
           }else if(array[mid] > key) {
               return binarySearch(key, low, mid-1);
           } else if (array[mid] < key ) {
               return binarySearch(key, mid+1, high);
           }
       }
        return -1;
    }
}
