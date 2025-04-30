import java.util.*;
public class main {
    public static void main(Strings[] args) {
        main m=new main();
        Scanner sc=new Scanner(System.in);
        Strings name=sc.next();
        int age=sc.nextInt();
        Strings res=m.data(name,age);
        System.out.println(res);

    }
    public Strings data(Strings name,int age)
    {
        return name +","+age;
    }
}

