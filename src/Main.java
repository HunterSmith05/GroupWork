import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("How many numbers will be in the array..?");
        int amount= in.nextInt();
        int [] array= new int[amount];
        method1(array, in);
        System.out.println("The average is "+method2(array));
        method3(array);
       
    }
    public static void method1(int[] array, Scanner in)
    {
        double sum=0;
        System.out.println("What are the numbers...");
         for(int i=0;i<array.length;i++)
        {
            array[i]=in.nextInt();
           
        }
        
    }
    public static double method2(int[] array)
    {
        double sum=0;
         for(int i=0;i<array.length;i++)
        {
           sum+= array[i];
           
        }
         return (sum/array.length);
    }
    public static void method3(int[] array)
    {
      System.out.println (Arrays.toString(array));
      
    }
        
       
}