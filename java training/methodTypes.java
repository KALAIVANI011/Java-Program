public class methodTypes{
    int num=12345;
    String name="kashwin";
    void drive()   //without parameter and without return type
    {
        System.out.println("kalai");
    }
    String choice() //without parameter with return type
    {
        return num+" "+name;
    }
    void play(String name)  //with parameter without return type
    {
        System.out.println(name);
    }
    String dash(String name,int rollno)
    {
        return name+" "+rollno;
    }
    public static void main(String[] args)
    {
        methodTypes kd=new methodTypes();
        kd.drive();
        String m=kd.choice();
        System.out.println(m);
        kd.play("dharani");
        kd.dash("kalai",20);
        
        
    }
}