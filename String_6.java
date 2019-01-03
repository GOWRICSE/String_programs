package String;
import java.util.Scanner;
public class String_6
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	String ss="";
	if(s1.length() != s2.length()) {
	if(s1.length() > s2.length())
	{
		ss=s2+s1+s2;
		System.out.println(ss);
	}
	else
	{
		ss=s1+s2+s1;
		System.out.println(ss);
	}
	}
	}
}