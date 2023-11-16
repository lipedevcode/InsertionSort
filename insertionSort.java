//ADT insertion-sort
public class insertionSort {
    public void sort(int[] arr, int n) {
        int[] newArr = new int[n];
        newArr[0] = arr[0];
        boolean swapped;
        int temp;
        for (int i = 1; i < n; i++) {
            swapped = false;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < newArr[j]) {
                    temp = newArr[j];
                    newArr[j] = arr[i];
                    newArr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                newArr[i] = arr[i];
        }
        for (int i = 0; i < n; i++)
            arr[i] = newArr[i];
    }
}
