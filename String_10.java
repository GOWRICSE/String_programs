package String;
import java.util.*;
public class String_10 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter thes string values : ");
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	String result="";
	if(s1.length() == s1.length())
	{
		for(int i=0;i<s1.length();i++)
		{
			result=result+s1.charAt(i)+s2.charAt(i);
		}
	}
	System.out.println(result);
}
}