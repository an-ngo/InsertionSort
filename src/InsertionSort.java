public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(temp>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
