import java.util.*;
public class adam {
    public static void main(Strings[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) //reverse a array
        {
            arr[i]=sc.nextInt();
        }
        // for(int i=n-1;i>=0;i--)
        // {
        //     System.out.print(arr[i] + " ");
        // }

        // int temp=0; //ascending order
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[i] < arr[j])
        //         {
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));


    //     for(int i: arr)  //even and odd 
    //     {
    //         if(i%2==0)
    //         {
    //             System.out.print(i);
    //         }
    //     }
    //     System.out.println("");
    //     for(int i: arr)
    //     {
    //         if(i%2!=0)
    //         {
    //             System.out.print(i);
    //     }

    // }

    // int max=arr[0];//max and min
    // int min=arr[0];
    // for(int i:arr)
    // {
    //     if(i>max)
    //     {
    //        max=i; 
    //     }
    //     else
    //     {
    //         min=i;
    //     }
    // }
    // System.out.println(max);
    // System.out.println(min);

}
}
