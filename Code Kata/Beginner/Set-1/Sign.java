import java.io.*;
import java.util.*;

public class Sign
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		if(n>0)
			System.out.println("The number is POSITIVE");
		else if(n<0)
			System.out.println("The number is NEGATIVE");
		else if(n==0)
			System.out.println("The number is ZERO");
	}
}