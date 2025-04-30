public class automorphic {
    public static void main(Strings[] args) {
        int n=11;
        int sq=n*n; //121
        while(n>0){
        if(n%10 != sq%10)
        {
            System.out.println("not");
            break;
        }
        n=n/10; //1
        sq=sq/10; //12
    }
    if(n==0) 
    {
        System.out.println("Automorphic");
    }
    }
}
