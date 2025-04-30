
import java.util.Arrays;

public class Strng {
    public static void main(String[] args){
        // to print each char in a string

        // String name="kalai";
        // String name=new String("kalai");
        // for(int i=0;i<name.length();i++)
        // {
        //     System.out.println(name.charAt(i));
        // }

        //reverse a string

        // String rev="";
        // for(int i=name.length()-1;i>=0;i--)
        // {
        //     rev+=name.charAt(i);
        // }
        // System.out.println(rev);

        //palindrome

        // String rev="";
        // for(int i=name.length()-1;i>=0;i--)
        // {
        //     rev+=name.charAt(i);
        // }
        // if(name.equals(rev)){
        // System.out.println("valid");
        // }
        // else 
        // {
        //     System.out.println("not valid");
        // }

        //count the vowels
        //METHOD 1
        // int count =0;
        // for(int i=0;i<name.length();i++)
        // {
        //     if(name.charAt(i)=='a' || name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u' )
        //     {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        //METHOD 2
        // int cnt=0;
        // for(int i=0;i<name.length();i++)
        // {
        //     char ch=name.charAt(i);
        //     if("aeiouAEIOU".indexOf(ch)!=-1)
        //     {
        //         cnt++;
        //     }
        // }
        // System.out.println(cnt);

        //number of non-alphabet

        // int count =0;
        // int numcount=0;
        // for(int i=0;i<name.length();i++)
        // {
        //     char ch=name.charAt(i);
        //     if(Character.isAlphabetic(ch))
        //     {
        //         count++;
        //     }
        //     if(Character.isDigit(ch))
        //     {
        //         numcount++;
        //     }
        // }
        // System.out.println(count);
        // System.out.println(numcount);

        String a="gum";
        String b="mug";
        char[] arr1=new char[a.length()];
        char[] arr2=new char[b.length()];
        for(int i=0;i<a.length();i++)
        {
            arr1[i]=a.charAt(i);
        }
        for(int i=0;i<b.length();i++)
        {
            arr2[i]=b.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int flag=0;;
        if(arr1.length == arr2.length)
        {
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==arr2[i])
            {
                flag=1;
            }
            else{
                flag=0;
            }
        }
        }
     if(flag==1)
     {
        System.out.println("Anagram");
     }
     else
     {
        System.out.println("not");
     }
    }
}