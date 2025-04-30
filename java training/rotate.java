import java.util.*;
//left rotate
public class rotate {
//     public static int[]  left(int a[],int n)
//     {
//         int temp,i;
//         temp=a[0];
//         for(i=0;i<n-1;i++)
//         {
//             a[i]=a[i+1];
//         }
//         a[n-1]=temp;
//         return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         left(a,n);
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
// }


public static boolean palindrome(String str)
{
    int n=str.length();
    int start=0;
    int end=n-1;
    while(start<end)
    {
        if(str.charAt(start)!=str.charAt(end))
        {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
public int substring(String str)
{
    int n=str.length();
    int i,j;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            String name=str.substring(i,j);
            if(this.palindrome(name))
            {
                System.out.print(name);
            }
        }
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    boolean result=palindrome(str);
    System.out.println(result);

}
}
