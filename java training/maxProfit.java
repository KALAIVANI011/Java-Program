import java.util.*;
public  class maxProfit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] profit=new int[n];
        for(int i=0;i<n;i++)
        {
            profit[i]=sc.nextInt();
        }
        int diff=0;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            if(profit[i]<profit[i+1])
            {
                diff=profit[i+1]-profit[i];
                sum+=diff;
            }
            else{
                continue;
            }
        }
        System.out.println(sum);
    }
}
    