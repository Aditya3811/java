//java to demonistrate this constructer demo
//14.09.2023
//aditya
//ThisMethodDemo
import java.io.*;
class A
{
    void m()
    {
        System.out.println("inside method m");
    }
    void n()
    {
        System.out.println("inside method n");
        this.m();
    }
}
public class ThisMethodDemo
{
    public static void main(String args[])
    {
        A a = new A();
        a.n();
    }
}
