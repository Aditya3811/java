public class DemoPrimeV1
{
    public static void main(String args[])
    {
        int num = 45;
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
