package SortingAlgorithm;

public class InsertionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr= {6,433,56,322,46,54,566,43};
        int n = arr.length;
        print(arr);
        for (int i = 1; i < n; i++) {
            for (int j = i; j >=1 ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else break;
            }
        }
        print(arr);
    }
}
