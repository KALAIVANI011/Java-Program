public class armstrng {
    public static void main(Strings[] args) {
        int n=153;
        int sum=0;
        int rem;
        int temp=n;
        int count=0;
        for(int i=n;i>0;i=i/10)//getting the digits 
        {
            count++;
        }
        while(n>0)
        {
            rem=n%10;
            int powers=(int) Math.pow(rem,count);
            sum=sum+powers;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("amstrong");
        }
        else 
        {
            System.out.println("not amstrong");       }
    }
}
