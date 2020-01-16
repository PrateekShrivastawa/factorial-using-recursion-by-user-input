// program for factorial using recursion by user input in java
import java.util.*;
class recursion
{
	public static int fact=1;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);// this will take the input by the user
		System.out.println("Enter the number");
		int a = sc.nextInt();
		recursion r = new recursion();
		r.m1(a);// this object calls the method m1 with providing the value 
		System.out.println("The factorial of the given number is "+fact);
	}
	void m1(int b)
	{
		if(b>=1)
		{
			fact=fact*b;
			m1(b-1);
		
		}
	}
}
