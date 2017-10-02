import java.io.*;
import java.util.*;

public class Sumfor
{
	public static void main(String args[])
		{
			System.out.println("Enter n");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int sum = 0;
			for(int i=0; i<n; i++)
				sum = sum + i;
			System.out.println("Sum of n Natural numbers is " + sum);
		}
}