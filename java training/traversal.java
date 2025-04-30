import  java.util.*;
public class traversal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==j)   //primary diagonal
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }
        // System.out.println();
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i+j==n-1)   //secondary diagonal
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // 
        

        //X pattern
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==j || i+j==n-1)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //boundary
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==0)   
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }

        // for(int i=1;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(j==n-1)   
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }

        // for(int i=2;i<n;i++)
        // {
        //     for(int j=n-1;j>=0;j--)
        //     {  
        //         if(j<n-1)
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }

        
        // for(int i=1;i<n-1;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(j==0)   
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }


        //snake travversing

        // for(int i=0;i<n;i++)
        // {
        //     if(i%2==0)
        //     {
        //         for(int j=0;j<n;j++)
        //         {
        //             System.out.print(a[i][j]);
        //         }
        //     }
        //      else 
        //         {
        //             for (int j=n-1; j>=0;j--) 
        //             {
        //                 System.out.print(a[i][j]);
                        
        //             }
        //         }
        //     }



        //spiral travresal

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==0)   
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }

        // for(int i=1;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(j==n-1)   
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }

        // for(int i=2;i<n;i++)
        // {
        //     for(int j=n-1;j>=0;j--)
        //     {  
        //         if(j<n-1)
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }

        
        // for(int i=1;i<n-1;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(j==0)   
        //         {
        //         System.out.print(a[i][j]);
        //         }
        //     }
        // }

        for(int i=0;i<n;i++)
        {
            for( int j=0;j<n;j++){
                if(i==0 )
                    System.out.print(a[i][j]+" ");
                else if(i>0 && j==n-1)
                    System.out.print(a[i][j]+" ");
            }
        }
        for(int j=n-1;j>=0;j--){
            int i = n-1;
            if(j<n-1){
                System.out.print(a[i][j]+" ");
            }
        }
        for(int i=n-1;i>0;i--)
        {
            int j=0;
            if(i<n-1 && i>0)
                System.out.print(a[i][j]+" "); 
        }

        }
    }
