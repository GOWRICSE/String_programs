package String;
import java.util.Scanner;
public class String_2 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String :");
	String s1=sc.next();
	String s2=sc.next();
	String result="";
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(s1.substring(s1.length()-1, s1.length()).equals(s2.substring(0, 1)))
	{
		s1=s1.substring(0,s1.length()-1);
		result=s1.concat(s2);
	}
	else
	{
		result=s1.concat(s2);
	}
	System.out.println("Result :"+result);
}
}