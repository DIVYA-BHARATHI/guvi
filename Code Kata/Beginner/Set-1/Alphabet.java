import java.io.*;
import java.util.*;

public class Alphabet
{
	public static void main(String args[]) throws Exception
	{
		
		try
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char alpha = s.next().charAt(0);
		if(Character.isLetter(alpha)){
		if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' )
			System.out.println(alpha + " is a VOWEL");
		else
			System.out.println(alpha + " is a CONSONANT");
		}
		else
		{System.out.println("Not an Alphabet");}
		}
		
		catch(Exception e)
			{	System.out.println(e);
				}
	}

}
