package String;
import java.util.Scanner;
public class String_13 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string : ");
	String ss=sc.nextLine();
	String result="";
	for(int i=0;i<ss.length()-2;i++)
	{
		if(ss.substring(i, i+2).equals("XY")) 
		{
		result=result+ss.charAt(i-1)+ss.charAt(i+2);
		}
	}
	System.out.println(result);
}
}