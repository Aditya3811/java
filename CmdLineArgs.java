import java.io.*;
public class CmdLineargs extends Object 
// Object is the superclass of all classes in java 
 {
  	public static void main(String args[])
      { 
     	int x = Integer.parseInt(args[0]);
     	int y = Integer.parseInt(args[1]);
     	int z = x + y;
     	System.out.println("Sum of "+x+ " and "+y+ " is" +z);
        CmdLineArgs sum = new CmdlineArgs();
        System.out.println("The class name of sum is"+sum.getclass);
   
        }
}
