import java.util.*;
public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // for(int i=0;i<n/2;i++)  //one method
        // {
        //     System.out.print(arr[i]+" "+arr[n-i-1]+" ");
        // }
        // if(n%2==1)
        // {
        //     System.out.print(arr[n/2]);
        // }

        int l=0;
        int r=n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                System.out.print(arr[l]);
                l++;
            }
            else{
                System.out.print(arr[r]);
                r--;
            }
        }
    }
}
