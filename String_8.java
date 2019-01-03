package String;
import java.util.Scanner;
public class String_8 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the tetms :");
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	int n=sc.nextInt();
	String result="";
	for(int i=0;i<n;i++)
	{
	result=result+s1+s2;	
	}
	result=result.substring(0,result.length()-1);
	System.out.println(result);
	
	
}
}