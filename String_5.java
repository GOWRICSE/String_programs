package String;
import java.util.Scanner;
public class String_5 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	if(s.length()>2)
	{
		s=s.substring(1, s.length()-1);
		System.out.println(s);
	}
	else
	{
		System.out.println(s);
	}
}
}