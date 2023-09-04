//prime number or not
import java.io.*;
import java.util.*;
public class DemoPrime
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter an integer");
        int num  = sc.nextInt();
        int flag = 0;
        for(int i = 2; i <= num/2; i++)
        {
            if (num % i == 0)
            {
                System.out.println(num + "it's  not a prime ");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println(num +"is a prime number");
        }
    }
}
