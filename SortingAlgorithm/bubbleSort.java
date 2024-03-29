package SortingAlgorithm;
public class bubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 8, 6, 4, 11, 10};
        int n = arr.length;
        System.out.println("Array before sorted");
        print(arr);
//        for (int x = 1; x < n-1; x++) {
//            for (int i = 0; i<n-1 ; i++) {
//                if (arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i]= arr[i+1];
//                    arr[i+1]= temp;
//                }
//            }
//        }
//        System.out.println("array after sorted");
//        print(arr);
//    }
//}
//     bubble sort optimised
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;
            for (int i = 0; i <n-1-i; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag==true) break;
        }
        System.out.println("array after sorting");
        print(arr);
    }
}