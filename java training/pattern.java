public class pattern
{
    public static void main(Strings[] args) {
        // int n=5;
        // for(int i=0;i<=n;i++)
        // {
        //     System.out.println(i+ " "+(n-i));
        // }

        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=6;j++)
        //     {
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }



        //square
    //     int n=5;
    //     for(int i=0;i<n;i++)
    //     {
    //     for(int j=0;j<n;j++)
    //     {
    //         System.out.print("* ");
    //     }
    //     System.out.println(" ");
    // }


    // hollow square

    // int n=5;
    
    //     for(int i=0;i<n;i++)
    //     {
    //     for(int j=0;j<n;j++)
    //     {
    //         if(i==0||j==0||i==n-1||j==n-1){
    //         System.out.print("* ");
    //     }
    //     else{
    //     System.out.print("  ");
    //     }
    // }
    // System.out.println(" ");
    // }

    //triangle with 1,3,5,7 (*)

        // int n=4;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i;j<n;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*i+1;j++)
        //     {
        //         System.out.print("*");
        //     }
        
        // System.out.println("");
        // }

        //right triangle

        // int n=5;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }


        //inverted right 
        // int n=5;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }



        //right arrow

        // int n=5;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }



        // mirror inverted right
        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("*");

        //     }
        //     System.out.println(" ");
        // }

        //mirror inverted left
        // int n=5;
        // for(int i=n;i>=1;i--)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");

        //     }
        //     System.out.println(" ");
        // }


        //left arrow
        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");

        //     }
        //     System.out.println(" ");
        // }
        // for(int i=n-1;i>=1;i--)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");

        //     }
        //     System.out.println(" ");
        // }




        // int n=5;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");

        //     }
        //     System.out.println(" ");
        // }
        // for(int i=n-1;i>=1;i--)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("* ");

        //     }
        //     System.out.println(" ");
        // }


        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }



    }
}