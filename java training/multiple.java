import java.util.*;
public class multiple{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i);
            }
            for(int j=1;j>i;j++)
            {
                if(n%j==0)
                {
                    System.out.print(j);
                }
            }
        }
    }
}