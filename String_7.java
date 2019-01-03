package String;
import java.util.Scanner;
public class String_7 
{
private static Scanner sc;

public static void main(String[] args) 
{
	sc = new Scanner(System.in);
	String ss=sc.nextLine();
	if(ss.charAt(0)=='x' && ss.substring(ss.length()-1, ss.length()).equals("x"))
	{
		System.out.println(ss.substring(1, ss.length()-1));
	}
	else
	{
		System.out.println(ss);
	}
}
}