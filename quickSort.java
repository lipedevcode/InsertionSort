public class quickSort {
    public void sort(int[] arr, int first, int fin) {
        int p;
        if (first < fin-1) {
            p = partition(arr, first, fin - 1);
            sort(arr, first, p - 1);
            sort(arr, p + 1, fin);
        }
    }

    public int partition(int[] arr, int first, int fin) {
        int pivot = arr[fin];
        int i = first;
        for (int j = first; j < fin; j++) {
            if (arr[j] <= pivot) {
                int aux = arr[j];
                arr[j] = arr[i];
                arr[i] = aux;
                i++;
            }
        }
        int aux = arr[i];
        arr[i] = pivot;
        arr[fin] = aux;
        return i;
    }
}
