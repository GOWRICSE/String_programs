package String;
import java.util.Scanner;
public class String_3 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
	sc = new Scanner(System.in);
	String str=sc.next();
	int len=str.length();
	String result="";
	if(str.length()>2)
	{
		str=str.substring(0, 2);	
		for(int i=0;i<len;i++)
		{
			result=result+str;
		}
	}
	else
	{
		result=str;
	}
		System.out.println(result);
	}
}