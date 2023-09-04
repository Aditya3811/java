import java.io.*;
import java.util.*;
public class Subtraction
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first integer");
        int x = sc.nextInt();
        System.out.println("enter second integer");
        int y = sc.nextInt();
        int z = x-y;
        System.out.println(x+"-"+y+"="+z);
        
    }
}
