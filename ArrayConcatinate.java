import java.util.Arrays;
import java.util.Scanner;
public class ArrayConcatinate {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int a1=arr1.length;
        int a2=arr2.length;
        int c=a1+a2;
        int[] arr3=new int[c];
        System.arraycopy(arr1, 0, arr3, 0, a1);
        System.arraycopy(arr2, 0, arr3, a1, a2);
        System.out.println(Arrays.toString(arr3));

        // without built-in method
        // int j=0;
        // for(int i=0;i<arr3.length;i++)
        // {
        //     if(i<a1)
        //     {
        //         arr3[i]=arr1[i];
        //     }
        //     else{
        //         arr3[i]=arr2[j++];
        //     }
        // }
        // for(int temp:arr3)
        // {
        //     System.out.print(temp+" ");
        // }
    }
}
