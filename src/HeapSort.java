public class HeapSort {
    int[] array;
    public HeapSort(int[] array){
        this.array = array;
    }

    public int[] heapSort(){
        int N = this.array.length;

        for (int i = N / 2 - 1; i >= 0; i--){
            heapify(this.array, N, i);
        }

        for (int i = N - 1; i > 0; i--) {
            int temp = this.array[0];
            this.array[0] = this.array[i];
            this.array[i] = temp;
            heapify(this.array, i, 0);
        }
        return array;
    }

    void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }

    }
