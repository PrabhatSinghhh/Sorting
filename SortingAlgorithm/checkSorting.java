package SortingAlgorithm;

public class checkSorting {
    public static void main(String[] args) {
        int[] arr= {8,3,45,6,7,9,2};
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i<n ; i++) {
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
