import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No of Elements In An Array : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a Target Element to Search : ");
        int t=sc.nextInt();
        System.out.println("------------------------");
        if(linearsearch(arr,t)){
            System.out.println("Element Is Found");
        }else {
            System.out.println("Element is Not Found");
        }
        System.out.println("------------------------");
    }

    private static boolean linearsearch(int[] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==t){
                return true;
            }
        }
        return false;
    }
}
