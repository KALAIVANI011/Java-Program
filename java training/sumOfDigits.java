public class sumOfDigits {
    public static void main(Strings[] args) {
        int n=335;
        int s=0;
        if(n>9)
        {
            s=(n%9==0)? 9:n%9;
            System.out.print(s);
        }
        else{
            s=n;
            System.out.print(s);
        }
    }
}
