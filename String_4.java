package String;
import java.util.Scanner;
public class String_4 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String x=sc.nextLine();
	int length=x.length();
	if(length%2 == 0)
	{
		length=length/2;
		x=x.substring(0, length);
		System.out.println(x);
	}
	else
	{
		System.out.println("NULL");
	}
}	
}