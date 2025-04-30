import java.util.*;
public class betrothed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum1+=i;
            }
        }
        for(int i=2;i<=m/2;i++)
        {
            if(m%i==0)
            {
                sum2+=i;
            }
        }
        if(n==sum2 && m==sum1)
        {
            System.out.println("betrothed number");
        }
        else
        {
         System.out.println("not a betrothed number");   
        }
    }
}
