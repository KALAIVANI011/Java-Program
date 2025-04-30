public class triangle {
   public static void main(Strings[] args) {
    for(int i=0;i<5;i++)
    {
        for(int j=1;j<=5-i-1;j++)
        {
            System.out.print(" ");
        }
            for(int k=1;k<=2*i+1;k++)
            {
                System.out.print("*");
            }
            for(int l=0;l<=5-i-1;l++)
            {
                System.out.print(" ");
            }
          System.out.println("");  
    }

    // for (int i = 5; i >=0; i--) 
    // {
    //     for(int j=5-i-1;j>=0;j--)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int k=2*i-1;k>0;k--)
    //     {
    //         System.out.print("*");
    //     }
    //     for(int l=5-i-1;l>=0;l--)
    //     {
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }

   } 
}
