package String;
import java.util.Scanner;
public class String_11 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	String result="";
	if(s1.length() == s2.length())
	{
		for(int i=0;i<s1.length();i++)
		{
			result=result+s1.charAt(i)+s2.charAt(i);
		}
	}
	System.out.println(result);
}
}