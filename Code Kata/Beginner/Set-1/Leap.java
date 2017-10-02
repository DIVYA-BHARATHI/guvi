import java.io.*;
import java.util.*;

public class Leap
{
	public static void main(String args[])
	{
		System.out.println("Enter the year");
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		if(y>0)
		{
		if(y%4==0)
			System.out.println(y + " is a Leap year");
		else
			System.out.println(y + " is not a leap year");
		}
		else
			System.out.println("Invalid Data");	
	}
}
