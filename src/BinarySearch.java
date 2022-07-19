import java.util.Scanner;

public class BinarySearch {
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
        if(binarysearch(arr,t)){
            System.out.println("Element Is Found");
        }else {
            System.out.println("Element is Not Found");
        }
        System.out.println("------------------------");
    }

    private static boolean binarysearch(int[] arr, int t) {
        int start=0;
        int end=arr.length;
        while(start<end){

            int mid=start+(end-start)/2;

            if(arr[mid]==t) return true;

            if(arr[mid]>t){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}
