import java.util.*;
public class subString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=5;
       int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();   
        }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i;j<n;j++)
        //     {
        //         ArrayList <Integer> list=new ArrayList<>();
        //         for(int k=i;k<=j;k++)
        //         {
        //             list.add(arr[k]);
        //         }
        //         System.out.println(list.toString());
        //     }
        // }
        subString soln=new subString();
        soln.sub(arr,0,n);
    }
    void sub(int arr[],int x,int n)
    {
        for(int i=x;i<n;i++)
        {
            System.out.println("[");
            for(int j=x;j<n;j++)
            {
                System.out.println(arr[j]);
                System.out.println("]");
            }
        }
        if(x<n)
        {
            
        }


    }
}