
//Maxwell Meckling
import java.util.Scanner;

public class C7_9 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        
        for(int i = 0; i < 10; i++)
        {
            numbers[i] = input.nextDouble();
        }
        min(numbers);
        
    }
    
    public static void min(double[] numbers)
    {
        double best = numbers[0];
        
        for(int i = 0; i < 9; i++)
        {
            if(numbers[i + 1] < best)
                best = numbers[i+1];
        }
        System.out.print("The minimum number is: " + best);
    }
}
