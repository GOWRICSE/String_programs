package String;
import java.util.Scanner;
public class String_12 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string : ");
	String ss=sc.nextLine();
	int l=sc.nextInt();
	String result="";
	for(int i=0;i<l;i++)
	{
		result=result+ss.substring(l-1, ss.length());
	}
	System.out.println(result);
}
}