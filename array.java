import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println();
        System.err.println("Sum of the array:"+sum);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // String j="22";
        // int i = Integer.parseInt(j);
        // System.out.println(j+11);
        // System.out.println(j.charAt(5));

    }
}
