import java.sql.Array;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No of Elements In an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        bubble_sort(arr);
    }

    private static void  bubble_sort(int[] arr) {
            int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}