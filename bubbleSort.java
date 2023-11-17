public class bubbleSort {
    public void sort(int [] arr, int n){
        for(int i = 0; i < n; i++){
            boolean swapped = false;
            for(int j = 0; j< n-i-1 ; j++){
                if(arr[j+1]<arr[j]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
    public void swap (int [] arr, int indexSmall, int indexBigger){
        int temp = arr[indexBigger];
        arr[indexBigger] = arr[indexSmall];
        arr[indexSmall] = temp;
    }
}
