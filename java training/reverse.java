import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    //     int rev=0;
    //     while(n>0)
    //     {
    //         int digit=n%10;
    //         rev=rev*10 + digit;
    //         n=n/10;
    //     }
    //     System.out.println(rev);

        // int num[]={1,5,3,2,4};
        // for(int i=num.length-1;i>=0;i--)
        // {
        //     System.out.print(num[i]+",");
        // }
        int arr[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print(i+j);
                }
            }
        }
        System.out.println(" ");
    }
}
