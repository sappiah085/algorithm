public class LinearSearch {
    int index = 0;
    int[] array;
    public  LinearSearch(int[] array){
        this.array = array;
    }
    public int linearSearch(int key){
        if(index == array.length)return -1;
        if(key == array[index]){
            return index;
        };
        index ++;
        return linearSearch(key);
    }
}
