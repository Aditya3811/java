//prime number or not
public class DemoPrimeV4
{
    public static void main(String args[])
    {
       int num =40,flag = 0;
       System.out.println("the list of  prime numbers from 2 to"+num+"are:");
        for(int i = 2; i <= num; i++)
        {
            flag = 0;
           for(int j = 2; j <= i/2;j++)
           {
            if (i % j ==0)
            {
                flag = 1;
                break;
            }
           }
                if (flag == 0)
            {
                System.out.print(i +"  ");
            }
        }
    }
}
