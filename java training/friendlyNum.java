public class friendlyNum {
    public static void main(Strings[] args) {
        int a=6;
        int b=27;
        int ac=0;
        int bc=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                ac=ac+i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                bc=bc+i;
            }
        } 
        int c=ac/a;
        int d=bc /b;
        if(c==d)
        {
            System.out.println("friendly");
        } 
    }
}
