import java.util.*;
public class leap{
    public static void main(Strings[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a%400==0 || a%4==0 && a%100!=0)
        {
            System.out.println(a + " is a leap year");
        }
        else{
            System.out.println(a+" is not a leap year");
        }
    }
} 
    

