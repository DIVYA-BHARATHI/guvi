import java.io.*;
import java.util.*;
import java.lang.Character;

public class AlphabetOrNot
{
	public static void main(String args[])
	{	 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char a = s.next().charAt(0);
		if(Character.isLetter(a))
			System.out.println("Entered character is an ALPHABET");
		else
			System.out.println("Entered character is not an alphabet");
	}
 
}
