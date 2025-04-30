import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int o=0;
        boolean isprime=true;
        while(true){
        int count=0;
        int N=m+n+o;
        for(int i=2;i<N;i++)
        {
            if(o%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(o);
            isprime=false;
        }
        o++;
        }
           
}
}
