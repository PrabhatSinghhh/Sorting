package SortingAlgorithm;

public class SelectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {10,-4,20,1,6,-8};
        int n = arr.length;
        print(arr);

        // selection sorting
        for (int i = 0; i<n-1; i++) {
            int min = Integer.MAX_VALUE; //traveling in loop and finding minimum value
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j]<min){
                    min= arr[j];
                    mindx=j;
                }
            }
            //swap arr[i] and arr[mindx]
            int temp = arr[i];
            arr[i]= arr[mindx];
            arr[mindx]= temp;
        }
        print(arr);
    }
}
