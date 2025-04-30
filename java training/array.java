public class array {
    public static void main(Strings[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++)
        // {
        //     sum+=arr[i];
        //     System.out.print(arr[i]);
            
        // }
        // System.out.println();
        // System.err.println("Sum of the array:"+sum);
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // String j="22";
        // int i = Integer.parseInt(j);
        // System.out.println(j+11);
        // System.out.println(j.charAt(5));


        //serach element in an array---> linear search
        // int target=21;
        // int position =-1;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]==target)
        //     {
        //         position=i;
        //         break;
        //     }
        // }
        // if(position!=-1)
        // {
        //     System.out.println("the position is:"+ position);
        // }
        // else{
        //     System.out.println("invalid");
        // }


        //binary search
        // int target =70;
        // int min=0;
        // int max=arr.length-1;
        // int res=-1;
        // while(min<=max)
        // {
        //     int mid=(min+max)/2;
        //     if(arr[mid]==target)
        //     {
        //         res=mid;
        //         break;
        //     }

        //     if(arr[mid]>target)
        //     {
        //         max=mid-1;
        //     }
        //     else{
        //         min=mid+1;
        //     }
        // }
        // if(res!=-1)
        // {
        //     System.out.println(res);
        // }
        // else{
        //     System.err.println("invalid");
        // }

        // int[] arr1=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr1[i]=sc.nextInt();
        // }
        // int[] arr2=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr2[i]=sc.nextInt();
        // }
        // int a1=arr1.length;
        // int a2=arr2.length;
        // int c=a1+a2;
        // int[] arr3=new int[c];
        // System.arraycopy(arr1, 0, arr3, 0, a1);
        // System.arraycopy(arr2, 0, arr3, a1, a2);
        // System.out.println(Arrays.toString(arr3));

        //without built-in method
        // int j=0;
        // for(int i=0;i<arr3.length;i++)
        // {
        //     if(i<a1)
        //     {
        //         arr3[i]=arr1[i];
        //     }
        //     else{
        //         arr3[i]=arr2[j++];
        //     }
        // }
        // for(int temp:arr3)
        // {
        //     System.out.print(temp+" ");
        // }

        int a[]={24,57,23,18,12};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print(a[i]+" ");
        }
        
    }
}
