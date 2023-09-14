//java to demonistrate this demo
//14.09.2023
//aditya
//ThisDemo1
import java.io.*;
class Student
{
    int RollNumber;
    String Name;
    float Fee;
    Student(int RollNumber, String Name, float Fee)
    {
        RollNumber = RollNumber;
        Name = Name;
        Fee =Fee;
    }
    void display()
    {
        System.out.println("student detials are");
        System.out.println(RollNumber+ " "+Name+" "+Fee);
    }
}
public class ThisDemo1
{
    public static void main(String args[])
    {
        Student s1 = new Student(4204,"G.aditya",45700);
        Student s2 = new Student(4202,"mani",45700);
        s1.display();
        s2.display();
    }
}
