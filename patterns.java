//right triangle

public class patterns {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(j+ " ");
            }
            System.out.println();
    }
}
}

//inverted triangle

/*public class patterns {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//combination of two triangle
/*public class patterns {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=4; i++) {
            for (int j = 4; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}

public class patterns {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //System.out.println();
    }
}*/

/*public class patterns {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" "); 
            }
            System.out.println();
    }
}}

public class patterns {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
}


public class patterns {
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                if(i==j || i+j==101)
                    System.out.print("X");
                else{
                    System.out.print(" ");
                }
                // System.out.println();
            }
            System.out.println();
        }
    }
}*/
/* 
public class patterns {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print("* ");
            }
            System.out.println();
        }
        //System.out.println();
        for(int i=0;i<=3;i++)
        {                                                //doubt
            for(int j=1;j>=i;j--)
            {
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i <=4; i++) {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
public class patterns {
    public static void main(String[] args) {
        for (int i = 0; i <=4; i++) {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

public class patterns {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i <=4; i++) {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
//number add
public class patterns {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i <=4; i++) {
            for(int j=4;j>=i;j--)
            
                System.out.print(" ");
            
            for(int k=1;k<=i;k++){
            
                System.out.print(count+" ");
                count++;}
            System.out.println();
        }
    }
}*/

// public class patterns {
//     public static void main(String[] args) {
//         char ch='A';
//         for (int i = 1; i <=5; i++) {
//             for(int j=5;j>=i;j--)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++)
//             {
//                 System.out.print( ch+ " ");
//             }
//             System.out.println();
//             ch++;
//             }
    //     }
    // }


