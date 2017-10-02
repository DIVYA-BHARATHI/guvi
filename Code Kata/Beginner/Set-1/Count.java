import java.io.*;
import java.util.*;

public class Count
{
public static void main(String args[])
{
System.out.println("Enter the integer");
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int count = 0;
while(a != 0)
        {
            a = a/10;
            ++count;
        }

System.out.println("Number of digits in the integer is/are " + count);
}}