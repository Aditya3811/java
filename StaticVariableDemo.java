//java to demonistrate static variable demo
//StaticVAriableDemo
//20-09-2023
//aditya
import java.io.*;
class Student
{
    int rollno;
    String name;
    static String collage = "SITE";
    Student(int R, String N)
    {
        rollno = R;
        name = N;
    }
    void  display()
    {
        System.out.println(rollno+""+name+""+collage);
    }
}
public class StaticVariableDemo
{
    public static void main(String args[])
    {
        Student s1 = new Student(242,"aditya");
        Student s2 = new Student(234,"ram");
        System.out.println("student detials are");
        s1.display();
        s2.display();
    }
}
