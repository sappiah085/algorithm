import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public  static int  inputs = 0;
    public static int[] array;
    public static boolean exit = false ;
    public static boolean optionWhatToDo = false;
    public static boolean doneInput = false;
    public static int[] start(){
        System.out.println("***********Welcome to codex ************''");
        System.out.println("****Input number of items");
        Scanner numberOfItem = new Scanner(System.in);
        array = new int[numberOfItem.nextInt()];
        System.out.println("Input list of items ");
        System.out.println("NB: For binary search enter sorted list");
        while (!doneInput){
            Scanner input = new Scanner(System.in);
            if(inputs == array.length) {
                doneInput = true;
                exit = true;
            }else if(input.hasNextInt()){
                array[inputs] = input.nextInt();
                inputs++;
            }

        }
        return array;
    };

    public static void optionWhatToDo(int[] array){
        System.out.println("****Select what you want to do******");
        while (!optionWhatToDo){
            System.out.println("1. Search");
            System.out.println("2. Sort");
            System.out.println("3. End");
            Scanner input = new Scanner(System.in);
           if (input.hasNextInt()){
               switch (input.nextInt()){
                   case 1:
                       boolean selectSearch = true;
                       while (selectSearch) {
                           System.out.println("1. Linear search");
                           System.out.println("2. Binary search");
                           System.out.println("3. Exit");
                           Scanner option = new Scanner(System.in);
                           if (option.hasNextInt()) {
                               switch (option.nextInt()) {
                                   case 1:
                                       System.out.println("Enter key to search");
                                       Scanner key = new Scanner(System.in);
                                       LinearSearch linear = new LinearSearch(array);
                                       System.out.println(linear.linearSearch(key.nextInt()));
                                       break;
                                   case 2:
                                       System.out.println("Enter key to search");
                                       Scanner keyBinary = new Scanner(System.in);
                                       BinarySearch binary = new BinarySearch(array);
                                       System.out.println(binary.binarySearch(keyBinary.nextInt(), 0, array.length-1));
                                       break;
                                   case 3:
                                       selectSearch = false;
                                       break;
                                   default:
                                       System.out.println("Try again");
                               }
                           }
                       }
                       break;
                   case 2:
                       System.out.println("1. Heap sort");
                       System.out.println("2. Merge Sort");
                       System.out.println("3. Quick sort");
                       System.out.println("4. Radix sort");
                       System.out.println("5. Bubble Sort");
                       System.out.println("6. Insertion sort");
                       System.out.println("7. Selection sort");
                       System.out.println("8. Exit");
                       boolean selectSort = true;
                       while (selectSort) {
                           Scanner options = new Scanner(System.in);
                           if (options.hasNextInt()) {
                               switch (options.nextInt()) {
                                   case 1:
                                       HeapSort heapSort= new HeapSort(array);
                                       for (int i = 0; i< heapSort.heapSort().length; i++){
                                           System.out.println(heapSort.heapSort()[i]);
                                       }
                                       selectSort = false;
                                       break;
                                   case 2:
                                       MergeSort mergeSort= new MergeSort();
                                       mergeSort.merge(array);
                                       for (int i = 0; i< array.length; i++){
                                           System.out.println(array[i]);
                                       }
                                       selectSort = false;
                                       break;
                                   case 3:
                                   QuickSort quickSort= new QuickSort();
                                   quickSort.quickSort(array,0, array.length - 1);
                                   for (int i = 0; i< array.length; i++){
                                       System.out.println(array[i]);
                                   }
                                   selectSort = false;
                                   break;
                                   case 4:
                                       RadixSort radixSort= new RadixSort();
                                       radixSort.radixsort(array, array.length);
                                       for (int i = 0; i< array.length; i++){
                                           System.out.println(array[i]);
                                       }
                                       selectSort = false;
                                       break;
                                   case 7:
                                       SelectionSort selectionSort = new SelectionSort(array);
                                       for (int i = 0; i< selectionSort.selectionSort().length; i++){
                                           System.out.println(selectionSort.selectionSort()[i]);
                                       }
                                       selectSort = false;
                                       break;
                                   case 6:
                                       InsertionSort insertion = new InsertionSort(array);
                                       for (int i = 0; i< insertion.insertionSort().length; i++){
                                           System.out.println(insertion.insertionSort()[i]);
                                       }
                                       selectSort = false;
                                       break;
                                   case 5:
                                       BubbleSort bubbleSort = new BubbleSort(array);
                                       for (int i = 0; i< bubbleSort.bubbleSort().length; i++){
                                           System.out.println(bubbleSort.bubbleSort()[i]);
                                       }
                                       selectSort = false;
                                       break;
                                   case 8:
                                       selectSort= false;
                                       break;
                                   default:
                                       System.out.println("Try again");
                               }
                           }
                       }
                       break;
                   case 3:
                       exit = true;
                       optionWhatToDo = true;
                       break;
                   default:
                       System.out.println("Try again");
               }
           }
        }


    }
    
    public static void main(String[] args) {
       int[] values = null;
        while (!exit){
           values = start();
           optionWhatToDo(values);
        }
    }
}