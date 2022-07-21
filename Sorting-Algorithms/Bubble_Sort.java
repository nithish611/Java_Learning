public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No of Elements In an Array : ");
        int n=sc.nextInt();
        int[] arr =new int(n);
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter The Target Element : ");
        int target = sc.nextInt();
        System.out.println(bubble_sort(arr,target));
    }
}