//java to demonistrate this constructer demo
//14.09.2023
//aditya
//ThisConstructerDemo
import java.io.*;
class A
{
A()
{
System.out.println("inside default constructar");
}
A(int x)
{
this();
System.out.println("inside parameter constructer");
System.out.println("x value is"+x);
}
}
public class ThisConstructorDemo
{
public static void main(String args[])
{
A a = new A(4242);
}
}
