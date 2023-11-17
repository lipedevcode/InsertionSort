public void sort(int[] arr, int n) {
    boolean swapped;
    for (int i = 0; i < n; i++) {
        int minIndex = i;
        swapped = false;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
                swapped = true;
            }
        }
        if (swapped)
            swap(arr, minIndex, i);
    }
}
public void swap(int [] arr, int minIndex, int index){
    int temp;
    temp = arr[minIndex];
    arr[minIndex] = arr[index];
    arr[index] = temp;
}
