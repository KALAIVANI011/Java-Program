public class strong {
    public static void main(Strings[] args) {
        int n=145;
        int temp=n;
        int rem;
        int sum=0;
        int count =0;
        while(n>0)
        {
            int fact=1;
            rem=n%10;
        for(int i=1;i<=rem;i++)
        {
            fact=fact*i;
        }
        sum=sum+fact; 
        n=n/10;
    }
    if(temp==sum)
    {
        System.out.println("Strong");
    }
    }
}
