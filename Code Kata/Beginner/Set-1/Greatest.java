import java.io.*;
import java.util.*;

public class Greatest
{
	public static void main(String args[])
	{
		System.out.println("Enter the 3 numbers");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a>b)	
			{
			if(a>c)
				System.out.println(a + " is greatest");
			else
				System.out.println(c + " is greatest");
 			}
		else
			{
			if(b>c)
				System.out.println(b + " is greatest");
			else
				System.out.println(c + " is greatest");
 			}

	}
}