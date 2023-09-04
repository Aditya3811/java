//prime number or not
public class DemoPrime
{
    public static void main(String args[])
    {
       int n,num,flag = 0;
        num = Integer.parseInt(args[0]);
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
